import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = scanner.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = scanner.nextInt();

        int ebob = 0;
        int ekok = 0;
        int i = 1;

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        i = (n1 > n2) ? n1 : n2;

        while (true) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("En Büyük Ortak Bölen: " + ebob);
        System.out.println("En Küçük Ortak Kat: " + ekok);
    }
}
