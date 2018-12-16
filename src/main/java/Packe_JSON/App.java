package Packe_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        List<Person> listOfPerson = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        boolean addNewPerson=true;
        while (addNewPerson!=false){
            //dokonczyć podpunkty z gwiazdkami
            String name;
            String surname;
            String pesel;

            System.out.println("Podaj imie");
            name=scanner.nextLine();

            System.out.println("Podaj nazwisko");
            surname=scanner.nextLine();

            System.out.println("Podaj nr PESEL");
            pesel=scanner.nextLine();

            listOfPerson.add(new Person(name, surname, pesel));

            System.out.println("Czy chcesz dodać kolejna osoba");
            String decision = scanner.nextLine();

            People people=new People(listOfPerson);

             ObjectMapper objectMapper=new XmlMapper();
             objectMapper.writeValue(new FileOutputStream("output3.xml"),people);

             if(decision.equalsIgnoreCase("tak")){
                 addNewPerson=true;
             }else if(decision.equalsIgnoreCase("nie")){
                 addNewPerson=false;
             }else System.out.println("Wprowadź wartość tak lub nie");
            System.out.println(decision.toString());
        }
        People a=new People();
        System.out.println(a.toString());
    }
}
