import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int size = scanner.nextInt();

        int[] list = new int[size];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}

