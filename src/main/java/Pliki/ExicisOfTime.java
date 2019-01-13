package Pliki;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Ta clasa odpowiedzialna jest za
 */
public class ExicisOfTime {
    public static void main(String[] args) {
       /* 1.Napisz metodę, która dla podanej daty sprawdzi czy jest to piątek trzynastego.
        2.Napisz metodę, która dla podanego roku wyświetli listę miesięcy wraz z ich długością (ilością dni).
        3.Napisz metodę, która dla zadanego miesiąca z bieżącego roku wyświetli wszystkie poniedziałki.
        */
//
//        LocalDateTime nowDateTime=LocalDateTime.now(); //pobierz obecną date
//        System.out.println("Obecny czas "+nowDateTime);
//        System.out.println("Czy jest to piatek trzynastego dnia miesiaca "+trzynastegoWPiatek(nowDateTime));
        //exercise2();
        //exercise3();
        exicise1();
    }
//    public static boolean trzynastegoWPiatek(LocalDateTime localDateTime){
//        LocalDateTime trzynastyPiatek= LocalDateTime.of(2018,05,13,12,12);
//        return localDateTime==trzynastyPiatek;
//    }
    //ad.2 Write a metode that, for a given year , reports the length of month within that year.
    private static void exercise2(){
        int year =2018;

        for(int month=1;month<=12;month++){
            int lengthOfMonth= LocalDate.of(year, month,1).lengthOfMonth();
            System.out.printf("Month:%s; Length of month: %s\n", month, lengthOfMonth);
        }
    }
    //ad.3 Write a methoday that, from a given month of current year, lists all of the Mondays in that month.
    private static void exercise3(){
        int month=12;
        LocalDate date=LocalDate.now().withMonth(month).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        int currentMonth=month;
        while (currentMonth==month){
            System.out.printf("%s%n",date);
            date=date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            currentMonth=date.getMonthValue();
        }
    }
    //ad1. Write a methode that tests whether a given date occurs as Friday of 13th.
    private static void exicise1() {
        int year=2018;
        int month =12;
        int day=13;

        System.out.println(LocalDate.of(year,month,day).getDayOfWeek()==DayOfWeek.FRIDAY&&day==13);
    }
}
