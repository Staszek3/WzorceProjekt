package Pliki;

import Packe_JSON.Person1;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;


public class App {
    final static Logger logger= (Logger) Logger.getLogger(DataTime.class);

    public static void main(String[] args) throws IOException {
        logger.info("Moja informacja");


   // private void ListaPlikow
        Path path= Paths.get("D:\\KursJava\\Listopad\\List3_4_2018");
       // Files.list(path).forEach(System.out::println);
        Files.list(path).forEach(System.out::println);
        BasicFileAttributes attr=Files
                .readAttributes(path, BasicFileAttributes.class);
        System.out.println(("creation time"+attr.creationTime()));
        logger.warn("Moje worningi");
        //zapisDoPliku();
    }

    private static void zapisDoPliku() throws IOException {
        List<String> contest= Arrays.asList("Linia1", "Linia2", "Linia3", "Ostatnie");
        Path path1 = Paths.get("D:\\KursJava\\Listopad\\List3_4_2018\\nowy1.txt");
        Files.lines(path1).forEach(System.out::println);
    }

    //Path path2  = Paths.get("C:\\Users");
    //Files.walk(path2, 2).forEach(System.out::println);
}
