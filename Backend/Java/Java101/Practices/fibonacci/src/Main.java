import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int total;
        int number1 = 0;
        int number2 = 1;

        System.out.print("Eleman sayısını giriniz : ");
        n = scanner.nextInt();

        System.out.print(n + " Elemanlı Fibonacci Serisi : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(number1 + " ");

            total = number1 + number2;
            number1 = number2;
            number2 = total;
        }
    }
}
