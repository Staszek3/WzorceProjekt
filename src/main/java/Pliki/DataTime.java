package Pliki;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import static java.time.LocalTime.MAX;

public class DataTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); //pobierz bierzaca data
        System.out.println(now);

        LocalDate anotherDate = LocalDate.of(2015, 2, 17);
        LocalDate anotherDate1 = LocalDate.parse("2015-02-17");

        LocalDate tomorrow = now.plus(1L, ChronoUnit.DAYS);
        LocalDate tomorrow1 = now.plusDays(1);

        LocalDate yesterday = now.minusDays(1);

        // pobieranie dnia tygodnia do podanej daty
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int dayOfWeekAsNumber = dayOfWeek.getValue();

        //lata przestepne

        boolean isLeapYear = now.isLeapYear();
        boolean isTommorow = tomorrow.isAfter(now);

        //obsługa samego czasu

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalTime anotherTime = LocalTime.of(15, 20);
        LocalTime anotherTime2 = LocalTime.parse("15:20");

        LocalTime oneHourLater = timeNow.plus(1L, ChronoUnit.HOURS);
        LocalTime oneHourLater4 = timeNow.plusHours(1);

        int hour = timeNow.getHour(); // pobiera godzinę w postaci liczby

        LocalTime maxTime = LocalTime.MAX;

        //obsługa pełnego czasu Data + czas

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime anotherDataTime = LocalDateTime.of(2017, 2, 3, 17, 18, 12);
        LocalDateTime anotherDataTime2 = LocalDateTime.parse("2015-02-20T06:30:00");

        // Tworzenie czasu ze stringa

        String str = "12-03-1991 06:07";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        // Otworzymy
        LocalDateTime dataTime = LocalDateTime.parse(str, formatter);
        System.out.println(dataTime);

//       //Tworzenie czasu ze stringa
//       DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy MM dd HH:mm");
//        String nowDateTimeAsString=dateTime.get(dtf);
//        System.out.println(nowDateTimeAsString);

        //TimeStamp
        long myTimeStamp = 1544862511L;
        LocalDateTime myLocalDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(myTimeStamp),
                TimeZone.getDefault().toZoneId());
        System.out.println(myLocalDateTime);

        //Zone-strefy
        TimeZone myTimeZone = TimeZone.getDefault();
        System.out.println(myTimeZone.toZoneId()); //wyswietlanie idenyfikatora strefy
        System.out.println(myTimeZone.getRawOffset()); //przesuniecie do strefy Grinwitch sekundach

        ZoneId zoneId = ZoneId.of("Europe/Warsaw"); //np tworzymy strefe Paryska
        System.out.println(zoneId.getRules().getOffset(Instant.EPOCH));

        //   wyświetla wszystkie strafy czasowe

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIds.size());
        // wyświetla wszystkie strafy czasowe z przesuieciem
        for (String zoneId1 : allZoneIds) {
            System.out.println(zoneId1 + "; " + ZoneId.of(zoneId1)
                    .getRules()
                    .getOffset(Instant.EPOCH));
        }
        Map<String, String> result = new LinkedHashMap<>();
    }
}


