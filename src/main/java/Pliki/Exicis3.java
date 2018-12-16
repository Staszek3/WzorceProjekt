package Pliki;

import java.time.LocalDateTime;

public class Exicis3 {
    public static void main(String[] args) {
       /* 1.Napisz metodę, która dla podanej daty sprawdzi czy jest to piątek trzynastego.
        2.Napisz metodę, która dla podanego roku wyświetli listę miesięcy wraz z ich długością (ilością dni).
        3.Napisz metodę, która dla zadanego miesiąca z bieżącego roku wyświetli wszystkie poniedziałki.
        */

        LocalDateTime nowDateTime=LocalDateTime.now(); //pobierz obecną date
        System.out.println("Obecny czas "+nowDateTime);
        System.out.println("Czy jest to piatek trzynastego dnia miesiaca "+trzynastegoWPiatek(nowDateTime));

    }
    public static boolean trzynastegoWPiatek(LocalDateTime localDateTime){
        LocalDateTime trzynastyPiatek= LocalDateTime.of(2018,05,13,12,12);
        return localDateTime==trzynastyPiatek;
    }

}
