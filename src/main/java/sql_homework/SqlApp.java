package sql_homework;

import java.sql.*;

public class SqlApp {
//private final static String URL="jdbc:postgresql://localhost:5432/firstpostgres";
private final static String URL="jdbc:postgresql://localhost:5432/sql-lesson";
    private final static String NAME="postgres";
private final static String PASSWORD="12345";

    public static void main(String[] args) throws SQLException {
        Connection conn= DriverManager.getConnection(URL,NAME,PASSWORD);
        String query="SELECT * FROM person";
        PreparedStatement stmt=conn.prepareStatement(query);
        ResultSet rset=stmt.executeQuery();
        while (rset.next()){
            int id = rset.getInt("id");
            String name = rset.getString("name");
            int age = rset.getInt("age");
            System.out.printf("%5d : %15s : %5d.\n", id, name, age);
        }

    }

}
