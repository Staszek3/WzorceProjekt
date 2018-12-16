package Pliki;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {

//        List<String> contest= Arrays.asList("Linia1", "Linia2", "Linia3", "Ostatnie");
//        Path path= Paths.get("D:\\KursJava\\Listopad\\List3_4_2018");
//        Files.list(path)
//                .filter(p ->p.toString().endsWith(".txt"))
//                .forEach(System.out::println)
//        ;
//
//        Path path1= Paths.get("D:\\KursJava\\Listopad\\List3_4_2018\\Nowy.txt");
//        Files.write(path1,contest);
//
//
//
////         int MaxDepth=2;
////         Files.walk(path,MaxDepth).forEach(System.out::println);
//
//         Path path2=Paths.get("D:\\KursJava\\Listopad\\List3_4_2018\\Nowy.txt");
//        BasicFileAttributes atryb=Files.readAttributes(path2,BasicFileAttributes.class);
//        System.out.println("creation time "+atryb.creationTime());
//        System.out.println("last acces time "+atryb.lastAccessTime());
        List<String> resultList = new ArrayList<>();

        Path path = Paths.get("D:\\KursJava\\Listopad\\List3_4_2018");
        Files.walk(path, 2).filter(p -> p.toString().endsWith(".txt")).forEach(p -> resultList.add(String.valueOf(p)));

        List<String> listOfFirstLines = resultList.stream().map(p -> {
            try {
                return Files.lines(Paths.get(p)).collect(Collectors.toList()).get(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        }).collect(Collectors.toList());

        Path path1 = Paths.get("D:\\KursJava\\Listopad\\List3_4_2018\\Nowy2.txt");

        Files.write(path1, listOfFirstLines);
    }
}
