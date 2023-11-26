import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int divisor) {
        if (divisor * divisor > number) {
            return true;
        }

        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " asal sayı değildir!");
        } else if (isPrime(number, 2)) {
            System.out.println(number + " asal sayıdır!");
        } else {
            System.out.println(number + " asal sayı değildir!");
        }
    }
}

