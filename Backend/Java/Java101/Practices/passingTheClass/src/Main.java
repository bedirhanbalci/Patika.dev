
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, physics, turkish, chemistry, music;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        math = scanner.nextInt();

        System.out.print("Fizik Notunuz : ");
        physics = scanner.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkish = scanner.nextInt();

        System.out.print("Kimya Notunuz : ");
        chemistry = scanner.nextInt();

        System.out.print("Muzik Notunuz : ");
        music = scanner.nextInt();

        int totalPoint = 0;
        int lessonCount = 0;
        boolean isInvalidPoint = false;

        if (math >= 0 && math <= 100) {
            totalPoint += math;
            lessonCount++;
        } else {
            isInvalidPoint = true;
            System.out.println("Geçersiz matematik notu girdiniz !");
        }
        if (physics >= 0 && physics <= 100) {
            totalPoint += physics;
            lessonCount++;
        } else {
            isInvalidPoint = true;
            System.out.println("Geçersiz fizik notu girdiniz !");
        }
        if (turkish >= 0 && turkish <= 100) {
            totalPoint += turkish;
            lessonCount++;
        } else {
            isInvalidPoint = true;
            System.out.println("Geçersiz türkçe notu girdiniz !");
        }
        if (chemistry >= 0 && chemistry <= 100) {
            totalPoint += chemistry;
            lessonCount++;
        } else {
            isInvalidPoint = true;
            System.out.println("Geçersiz kimya notu girdiniz !");
        }
        if (music >= 0 && music <= 100) {
            totalPoint += music;
            lessonCount++;
        } else {
            isInvalidPoint = true;
            System.out.println("Geçersiz müzik notu girdiniz !");
        }
        if (!isInvalidPoint) {
            double ortalama = (double) totalPoint / lessonCount;
            if (ortalama >= 55) {
                System.out.println("Ortalama: " + ortalama + " - Geçti");
            } else {
                System.out.println("Ortalama: " + ortalama + " - Kaldı");
            }
        }
    }
}