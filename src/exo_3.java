import java.util.Scanner;

public class exo_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir a :");

        int a = scanner.nextInt();
        System.out.println("Saisir b :");
        int b = scanner.nextInt();

        int result = a*a + b*b;
        System.out.println("La somme des carrés de a et b est égal à : " + result);

        scanner.close();
    }
}
