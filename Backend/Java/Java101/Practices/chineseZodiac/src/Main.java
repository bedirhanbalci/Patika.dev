import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String horoscope = "";
        boolean isError = false;

        System.out.print("Doğum yılınızı giriniz : ");
        int dateOfBirth = input.nextInt();

        int number = (dateOfBirth % 12);

        switch (number) {
            case 0:
                horoscope = "Maymun";
                break;
            case 1:
                horoscope = "Horoz";
                break;
            case 2:
                horoscope = "Köpek";
                break;
            case 3:
                horoscope = "Domuz";
                break;
            case 4:
                horoscope = "Fare";
                break;
            case 5:
                horoscope = "Öküz";
                break;
            case 6:
                horoscope = "Kaplan";
                break;
            case 7:
                horoscope = "Tavşan";
                break;
            case 8:
                horoscope = "Ejderha";
                break;
            case 9:
                horoscope = "Yılan";
                break;
            case 10:
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;

            default:
                isError = true;
                break;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız !");
        } else {
            System.out.println("Çin zodyağı burcunuz : " + horoscope);
        }
    }
}