import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Dik Üçgen Hipotenüs Hesaplama

        int a, b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);


        // Üçgen Alan Hesaplama

        double cevre = (a+b+c);
        double u = cevre / 2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);

    }
}
