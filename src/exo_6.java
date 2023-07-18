import java.util.Arrays;
import java.util.Scanner;

public class exo_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une chaine :");
        String chaine = scanner.nextLine();

        System.out.println("En minuscule : " + chaine.toLowerCase());
        System.out.println("En majuscule : " + chaine.toUpperCase());

        String chaineTab[] = chaine.split("");


        System.out.println("En tableau :" + Arrays.toString(chaineTab));

        char[] chaineTabCar = chaine.toCharArray();
        chaineTabCar[0] = Character.toUpperCase(chaineTabCar[0]);
        System.out.println( "La première lettre en majuscule : " + chaineTabCar);

        scanner.close();
    }
}
