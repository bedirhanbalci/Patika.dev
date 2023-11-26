import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;

        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı");
        } else if (total == number) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir!");
        }

    }
}
