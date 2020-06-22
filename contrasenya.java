import java.util.Scanner;

public class contrasenya {
    
public static final int LONG_CONTRASENYA = 8;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "Entra la contrasneya. Tingues en compte les següents restriccions:" +               "- Les contrasenyes han de tenir 10 caràcters com a mínim.\n" +
                "- Hi ha d’haver almenys dos números.\n" +
                "- Hi ha d’haver lletres en majúscules i en minúscules\n" +
                "- Hi ha d’haver un símbol que no pot estar ni al principi ni al final\n" +
                "Contrasenya: ");

        String s = input.nextLine();

        if (esValida(s)) {
            System.out.println("Contrasenya acceptada: " + s);
        } else {
            System.out.println("Contrasenya NO acceptada: " + s);
        }

    }

    public static boolean esValida(String password) {

        if (password.length() < LONG_CONTRASENYA) return false;

        int numCaracters = 0;
        int numNumeros = 0;
        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            if (esNumero(c)) numNumeros++;
            else if (esLletra(c)) numCaracters++;
            else return false;
        }


        return (numCaracters >= 2 && numNumeros >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean esNumero(char c) {

        return (c >= '0' && c <= '9');
    }
}
