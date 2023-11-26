import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        int enteredNumber = 5;

        int smallestNearest = Integer.MIN_VALUE;
        int biggestNearest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < enteredNumber && number > smallestNearest) {
                smallestNearest = number;
            }

            if (number > enteredNumber && number < biggestNearest) {
                biggestNearest = number;
            }
        }

        System.out.println("Dizi : " + Arrays.toString(numbers));
        System.out.println("Girilen Sayı : " + enteredNumber);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallestNearest);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + biggestNearest);
    }
}



