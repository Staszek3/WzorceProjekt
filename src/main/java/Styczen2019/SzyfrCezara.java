package Styczen2019;

public class SzyfrCezara {
    public static void main(String[] args) {
        String text="NOWYSTYL";
        System.out.println("Przed zaszyfrowaniem "+text);
        System.out.println("Po zaszyfrowaniu "+zaszyfrowany(text));
    }
    public static String zaszyfrowany(String origin) {
        char[] charOrigin = origin.toCharArray();
        String zazaszyfrowany = "";
        char[] originalAlfab = {'A', 'Ą', 'B', 'C', 'Ć', 'D', 'E', 'Ę', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'Ł', 'M',
                'N', 'Ń', 'O', 'Ó', 'P', 'R', 'S', 'Ś', 'T', 'U', 'W', 'Y', 'Z', 'Ź', 'Ż'};
        char[] szyfrowanyAlfab = {'C', 'Ć', 'D', 'E', 'Ę', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'Ł', 'M',
                'N', 'Ń', 'O', 'Ó', 'P', 'R', 'S', 'Ś', 'T', 'U', 'W', 'Y', 'Z', 'Ź', 'Ż', 'A', 'Ą', 'B',};
         char[] zaszyfrowany=new char[charOrigin.length];
        for (int i = 0; i < charOrigin.length; i++) {

            for (int j = 0; j < originalAlfab.length; j++) {
                if (charOrigin[i] == originalAlfab[j]) {

                    int k=0;
                    zaszyfrowany[k]=szyfrowanyAlfab[j];
                    k++;
                }
               zazaszyfrowany=zaszyfrowany.toString();
            }
        }
        return zazaszyfrowany;
    }
  }
