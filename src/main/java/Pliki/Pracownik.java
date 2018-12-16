package Pliki;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Long.*;

public class Pracownik {

    private String name;
    private String lastName;
    private long id_depart;
    private char sex;
    private BigDecimal salery;

    public Pracownik(String name, String lastName, long id_depart, char sex, BigDecimal salery) {
        this.name = name;
        this.lastName = lastName;
        this.id_depart = id_depart;
        this.sex = sex;
        this.salery = salery;
    }

    public static void main(String[] args) throws IOException {

        List< String> linieZPliku= new ArrayList<>();
        Path path = Paths.get("D:\\KursJava\\Listopad\\WzorceProjekt\\src\\main\\java\\Pliki\\Osoba.txt");
        linieZPliku=Files.lines(path).collect(Collectors.toList());
        String[] data=linieZPliku.get(0).split(" ");
        Pracownik pracownik = new Pracownik(data[0], data[1], getLong(data[2]), data[3].charAt(0), new BigDecimal(data[4]));
        // for ( i:pracownik){
             System.out.println(pracownik);

        Path path1 = Paths.get("D:\\KursJava\\Listopad\\WzorceProjekt\\src\\main\\java\\Pliki\\Osoba1.txt");

        Files.write(path1, linieZPliku);
    }
}
