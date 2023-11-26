import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int counter = scanner.nextInt();

        if (counter <= 0) {
            System.out.println("Geçerli bir pozitif sayı giriniz.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}