import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int total = 0;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int k = scanner.nextInt();


        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i != 0) {
                index++;
                total += i;
                System.out.println(i);

            }
        }
        int average = total / index;
        System.out.println("3 ve 4'e kalansız bölünen sayıların toplamı : " + total);
        System.out.println("3 ve 4'e kalansız bölünen sayıların adedi : " + index);
        System.out.println("Ortalama : " + average);

    }
}

