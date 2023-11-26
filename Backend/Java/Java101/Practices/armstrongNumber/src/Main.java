import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = scanner.nextInt();

        int stepNumber = 0;
        int tempNumber = number;
        int stepValue;
        int result = 0;
        int stepPow;
        int total = 0;

        while (tempNumber != 0) {
            stepValue = tempNumber % 10;
            tempNumber /= 10;
            total = total + stepValue;
            stepNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            stepValue = tempNumber % 10;
            stepPow = 1;
            for (int i = 1; i <= stepNumber; i++) {
                stepPow *= stepValue;
            }
            result += stepPow;
            tempNumber /= 10;
        }

        System.out.println("Basamak sayılarının toplamı : " + total);
        System.out.println("Basamak sayısı : " + stepNumber);

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }
    }
}

