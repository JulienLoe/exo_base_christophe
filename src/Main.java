import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Maj+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Saisir a ?");
            int a = scanner.nextInt();
            System.out.println("Saisir b ?");
            int b = scanner.nextInt();

            System.out.println("Les valeurs sont : a =" + a +" et  b = " + b );
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("Permutées les valeurs sont : a =" + a +" et  b = " + b );

        }
    }
}