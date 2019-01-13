package Styczen2019.lombok;


//

import lombok.Setter;


//@Getter
//@ToString(exclude = {"nazwisko"})
//@EqualsAndHashCode

import lombok.Data;
import lombok.ToString;

//adnotacja @Data laczy cztery powyzsze adnotacje
//@Data
@ToString(exclude = {"nazwisko"})
@Setter
public class Osoba {
    private String imie;
   // @EqualsAndHashCode.Exclude
    private String nazwisko;

//    public void setImie(String imie) {
//        this.imie = imie;
//    }
//
//    public void setNazwisko(String nazwisko) {
//        this.nazwisko = nazwisko;
//  }
}
