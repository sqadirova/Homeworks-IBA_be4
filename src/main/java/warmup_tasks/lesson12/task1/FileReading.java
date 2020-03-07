package warmup_tasks.lesson12.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReading {
    public static void main(String[] args) throws IOException {
        Map<String,List<String>> map1=new HashMap<>();

        Path sv_path = Paths.get("./data", "subj_verb.txt");
        List<String> sv_Lines = Files.readAllLines(sv_path, StandardCharsets.UTF_8);
        for (String line:sv_Lines) {
            String[] str = line.trim().split(":");
            System.out.println(str[0]);
            String[] str2 = str[1].trim().split(",");
        }



        Path vo_path=Paths.get("./data","verb_obj.txt");
        List<String> vo_Lines = Files.readAllLines(vo_path, StandardCharsets.UTF_8);



        // lists.forEach(p-> System.out.println(p));



//        sv_Lines.forEach(p -> System.out.println(p));
//        vo_Lines.forEach(p -> System.out.println(p));


        // File file = new File("./data", "subj_verb.txt");
//        FileReader fr = new FileReader(file);
        // Stream<String> lines = new BufferedReader(new FileReader(file)).lines();
        //lines.forEach(p-> System.out.println(p));


    }
}
