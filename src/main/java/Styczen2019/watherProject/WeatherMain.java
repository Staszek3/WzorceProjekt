package Styczen2019.watherProject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
/*
       1) Wczytaj pogodę ze wszystkich stacji pogodowych
        http://traffic.erzeszow.pl/scripts/weather.php
        2) Oblicz średnią wartość dla temp. gruntu (-20cm), jezdni, powietrza (20cm nad ziemią oraz 2m nad ziemią), prędkości i kierunku wiatru oraz wielkości odpadów.
        3) Wyświetl statystyki
        4) Uwzględnij do obliczeń tylko te stacje z których odczytano dane nie później niż 10 minut temu.
        5) Wyświetl informację z ilu stacji zostały pobrane dane oraz z ilu zostały pominięte.
        6) Wyświetl minimalne i maksymalne wartości dla zbieranych metryk
*/
public class WeatherMain {

    public static void main(String[] args) throws IOException, URISyntaxException {

        URI uri = new URI("http://traffic.erzeszow.pl/scripts/weather.php");
        String response = IOUtils.toString(uri, StandardCharsets.UTF_8.name()).substring(1);

        // System.out.println(response);


        ObjectMapper mapper = new ObjectMapper();//.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        //        new ObjectMapper()
//                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

        StationWeather[] stacje = mapper.readValue(response, StationWeather[].class);


        System.out.println(stacje[0]);
        System.out.println(stacje[4]);

        System.out.println("Ilość Stacji Meteo w Rzeszowie= " + stacje.length);
        System.out.println("Wyznaczenie średnich wartości z 25 Stacji wszystkich danych ");
        //Temperatura gruntu (20cm pod powierzchnią ziemi)
        long sumaTemp20cm = 0;
        for (int i = 0; i < stacje.length; i++) {

            sumaTemp20cm += Long.valueOf(stacje[i].getTemp20cm());
        }
        long sredniaTemp20cm = sumaTemp20cm / stacje.length;
        System.out.println("Srednia Temp. 20 cm pod powierzchnia ziemi ze wszystkich stacji = " + sredniaTemp20cm);
        //Temperatura powietrza, 2m nad powierzchnią ziemi
        long sumaTemp2m = 0;
        for (int i = 0; i < stacje.length; i++) {

            sumaTemp2m += Long.valueOf(stacje[i].getTemp2m());
        }
        long sredniaTemp2m = sumaTemp2m / stacje.length;
        System.out.println("Srednia Temp. nad gruntem 2 m ze wszystkich stacji = " + sredniaTemp2m);
        // Temperatura jezdni
        long sumaTemp0m = 0;
        for (int i = 0; i < stacje.length; i++) {

            sumaTemp0m += Long.valueOf(stacje[i].getTemp0m());
        }
        long sredniaTemp0m = sumaTemp0m / stacje.length;
        System.out.println("Srednia Temp. na gruncie 0 m ze wszystkich stacji = " + sredniaTemp0m);
        // Temp 5 cm nad powierzchnia ziemi
        long sumaTemp5cm = 0;
        for (int i = 0; i < stacje.length; i++) {

            sumaTemp5cm += Long.valueOf(stacje[i].getTemp5cm());
        }
        long sredniaTemp5cm = sumaTemp5cm / stacje.length;
        System.out.println("Srednia Temp. nad gruntem 5 cm ze wszystkich stacji = " + sredniaTemp5cm);
        // Kierunek wiatru
        long sumaWind_dir = 0;
        for (int i = 0; i < stacje.length; i++) {

            sumaWind_dir += Long.valueOf(stacje[i].getWind_dir());
        }
        long sredniaWind_dir = sumaWind_dir / stacje.length;
        System.out.println("Sredni kierunek ze wszystkich stacji = " + sredniaWind_dir);
        //Predkosc wiatru w m/s
        long sumaWind_speed = 0;
        for (int i = 0; i < stacje.length; i++) {

            sumaWind_speed += Long.valueOf(stacje[i].getWind_speed());
        }
        long sredniaWind_speed = sumaWind_speed / stacje.length;
        System.out.println("Srednia prędkosc witru w m/s ze wszystkich stacji = " + sredniaWind_speed);

        //Wielkość opadów (mm)
        long sumaPrecipitation = 0;
        for (int i = 0; i < stacje.length; i++) {

            sumaPrecipitation += Long.valueOf(stacje[i].getPrecipitation());
        }
        long sredniaPrecipitation = sumaPrecipitation / stacje.length;
        System.out.println("Srednia Wielkość opadów (mm) ze wszystkich stacji = " + sredniaPrecipitation);

        //Ostatni pomiar czasu

        for (int i = 0; i < stacje.length; i++) {

            System.out.println("Ostatni pomiar czasu ze stacji " + i + " = " + stacje[i].getMeasure_time());
        }
    }

}

