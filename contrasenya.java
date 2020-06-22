import java.util.Scanner;

public class contrasenya {
    public static final int LONG_CONTRASENYA = 8;

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print(
                    "Entra la contrasneya. Tingues en compte les següents restriccions: \n" +
                    "- Les contrasenyes han de tenir 8 caràcters com a mínim.\n" +
                    "- Hi ha d’haver lletres.\n" +
                    "- Hi ha d’haver algun número\n" +
                    "Contrasenya: ");
            String s = input.nextLine();

            if (esValida(s)) {
                System.out.println("Contrasenya acceptada: " + s);
            } else {
                System.out.println("Contrasenya NO acceptada: " + s);
            }
        }

        public static boolean esValida(String password) {
            int numCaracters = 0;
            int numNumeros = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (esNumero(c)) numNumeros++;
                else if (esLletra(c)) numCaracters++;
                else return false;
            }

            return (password.length() >= LONG_CONTRASENYA && numCaracters >= 1 && numNumeros >= 1);
        }

        public static boolean esLletra(char c) {
            c = Character.toUpperCase(c);
            return (c >= 'A' && c <= 'Z');
        }

        public static boolean esNumero(char c) {
            return (c >= '0' && c <= '9');
        }
    }
}
