import java.util.Scanner;

public class contrasenya {
    
public static final int LONG_CONTRASENYA = 10;

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Entra la contrasneya. Tingues en compte les següents restriccions:" +
                "- Les contrasenyes han de tenir 10 caràcters com a mínim.\n" +
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

    private static boolean esValida(String password) {
        int numCaractersMaj = 0;
        int numCaractersMin = 0;
        int numNumeros = 0;
        int numSimbols = 0;
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (esNumero(c)) numNumeros++;
            else if (esLletraMajuscula(c)) numCaractersMaj++;
            else if (esLletraMinuscula(c)) numCaractersMin++;
            else if (i <> 0 && i < password.length()-1) numSimbols++;
        }

        return (password.length() >= LONG_CONTRASENYA && numCaractersMaj >= 1 && numCaractersMin >= 1 && numNumeros >= 2 && numSimbols >= 1);
    }

    private static boolean esLletraMajuscula(char c) {
        return (c >= 'A' && c <= 'Z');
    }

    private static boolean esLletraMinuscula(char c) {
        return (c >= 'a' && c <= 'z');
    }

    private static boolean esNumero(char c) {
        return (c >= '0' && c <= '9');
    }
}
