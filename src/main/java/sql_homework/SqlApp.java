package sql_homework;

import java.sql.*;

public class SqlApp {
    private final static String URL = "jdbc:postgresql://localhost:5432/sql-lesson";
    private final static String NAME = "postgres";
    private final static String PASSWORD = "12345";

    //SELECT
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        String query = "SELECT * FROM person";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rset = stmt.executeQuery();
        while (rset.next()) {
            int id = rset.getInt("id");
            String name = rset.getString("name");
            int age = rset.getInt("age");
            System.out.printf("%5d : %15s : %5d.\n", id, name, age);
        }
    }

    //SELECT WHERE
    public static void main2(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
//        String query = "SELECT * FROM person";
        int p1=25;
        String query = "SELECT * FROM person WHERE age=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1,p1);
        ResultSet rset = stmt.executeQuery();
        while (rset.next()) {
            int id = rset.getInt("id");
            String name = rset.getString("name");
            int age = rset.getInt("age");
            System.out.printf("%5d : %15s : %5d.\n", id, name, age);
        }

    }

    //Insert query ???
    /*String p1="Suzy";
    int p2=30;
    String sql="INSERT INTO person (id,name,age) VALUES (DEFAULT,?,?)";
    PreparedStatement stmt=conn.prepareStatement(sql);
        stmt.setString(1,p1);
        stmt.setInt(2,p2);*/
}
