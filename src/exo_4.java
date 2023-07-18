import java.util.Scanner;

public class exo_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.println("Quel est votre age ?");
        age = scanner.nextInt();
        System.out.println(age > 18);

        scanner.close();
    }
}
