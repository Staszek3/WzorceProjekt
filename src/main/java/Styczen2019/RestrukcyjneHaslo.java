package Styczen2019;

public class RestrukcyjneHaslo {
    /* Napisać metode do validacji hasła
    1. Hasło musi mieć co najmniej osiem znaków.
    2. Hasło składa się tylko z liter i cyfr i znaków specjalnych (!@#$%).
    3. Hasło musi zawierać co najmniej dwie cyfry
    4. Hasło musi zawierać co najmniej jedną dużą literę
    5. Hasło musi zawierać co najmniej jeden znak specjalny
*/
    public static void main(String[] args) {
        boolean a = validationOfPassword1("cyfra_nowa");
    }

    public static boolean validationOfPassword1(String password) {
        //ad:1 - sprawdzenie ilosci znakow
        char[] arrayPassword = password.toCharArray();
        if (arrayPassword.length < 8) {
            System.out.println("Hasło jest zbyt krotkie");
            return false;
        } else {
            System.out.println("OK Hasło nie ma mniej niż 8 znaków");
            return true;
        }
    }
    public static boolean validationOfPassword3(String password) {
        //ad:3 - sprawdzenie czy sa dwie cyfry w hasle
        return true;
    }
}
