import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sinifimizi tanimladik
        Scanner inp = new Scanner(System.in);

        // Kullanicidan degerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        boolean gecmeNotu = ort >= 60;
        String sonuc = gecmeNotu ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println("Gecme Notunuz: " + ort + " " + sonuc);
        }
    }
