import java.util.Scanner;

public class Main {

    static int recursivePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1 / recursivePower(base, -exponent);
        } else {
            return base * recursivePower(base, exponent - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int exponent = scanner.nextInt();

        System.out.println("Sonuç : " + recursivePower(base, exponent));
    }
}

