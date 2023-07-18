import java.util.Scanner;

public class exo_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le rayon :");
        int r = scanner.nextInt();
        System.out.println("Saisir la hauteur :");
        int h = scanner.nextInt();

        double result = (Math.PI * (r*r) * h)/3;
        double twoNumber = Math.round(result * 100.0) / 100.0;
        System.out.println("Le volume du cône est de : " + twoNumber + "cm3");

        scanner.close();

    }
}
