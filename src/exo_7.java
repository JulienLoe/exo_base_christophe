import java.util.Scanner;

public class exo_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la longueur d'un coté : ");
        int cote = scanner.nextInt();

        System.out.println("Le périmètre du carré est de : " + cote * 4 +  " cm");
        System.out.println("Le périmètre du carré est de : " + cote * cote + " cm3");

        scanner.close();
    }
}
