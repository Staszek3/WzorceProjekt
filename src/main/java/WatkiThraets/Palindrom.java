package WatkiThraets;

public class Palindrom {

    //program do twożenia palidromow ze stringa
    // ile krokow dodawania (czyli sprawdzanie stringa czy jest już palidromem )
    // aby utwrzyć palidera i jaki będzie
    public static void main(String[] args) {
        String number = "627";

        int counter = 0;
        int sum;

        while (!isPalindrom(number)) {
            counter++;
            sum = Integer.valueOf(number) + Integer.valueOf(new StringBuilder(number).reverse().toString());
            number = String.valueOf(sum);
        }

        System.out.println("Obliczona liczba " + number + " jest palindromem. Liczba wykonanych dodawan: " + counter);

    }

    /** Ta metoda służy do czegos
     * @param input Przyjmuje para
     * @return
     */
    public static boolean isPalindrom(String input) {

        String reverse = new StringBuilder(input).reverse().toString();

        return input.equals(reverse);

    }


}
