import java.util.Scanner;

public class exo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir a ?");
        int a = scanner.nextInt();
        System.out.println("Saisir b ?");
        int b = scanner.nextInt();

        System.out.println("Les valeurs sont : a = " + a +" et  b = " + b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Permutées les valeurs sont : a = " + a +" et  b = " + b );

        scanner.close();
    }
}
