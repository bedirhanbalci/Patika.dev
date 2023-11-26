import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, price;
        int flightType, age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi Km türünden giriniz :  ");
        distance = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        flightType = scanner.nextInt();

        if (distance > 0 && age > 0 && (flightType == 1 || flightType == 2)) {
            price = 0.10 * distance;
            if (age < 12) {
                price *= 0.5;
            } else if (age < 25) {
                price *= 0.9;
            } else if (age > 65) {
                price *= 0.7;
            }
            if (flightType == 2) {
                price *= 0.8;
                price *= 2;
            }
            System.out.println("Toplam Tutar : " + price + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
