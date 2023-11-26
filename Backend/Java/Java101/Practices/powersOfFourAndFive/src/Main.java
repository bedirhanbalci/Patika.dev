
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = scanner.nextInt();

        System.out.print("4 Sayısının Kuvvetleri : ");
        int power4 = 1;
        while (power4 <= number) {
            System.out.print(power4 + ", ");
            power4 *= 4;
        }

        System.out.println();

        System.out.print("5 Sayısının Kuvvetleri : ");
        int power5 = 1;
        while (power5 <= number) {
            System.out.print(power5 + ", ");
            power5 *= 5;
        }
    }
}
