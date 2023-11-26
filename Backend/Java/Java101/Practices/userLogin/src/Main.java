import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName = "patika";
        String cPassword = "java1234";
        String password = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        String inputUser = scanner.nextLine();

        System.out.print("Şifreniz : ");
        String inputPassword = scanner.nextLine();

        if (inputUser.equals(userName) && inputPassword.equals(cPassword)) {
            System.out.println("Giriş Yaptınız !");
        } else if (inputUser.equals(userName)) {
            System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? ");
            String resetPassword = scanner.nextLine();

            if (resetPassword.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Şifre : ");
                String newPassword = scanner.nextLine();

                if (newPassword.equals(inputPassword) || newPassword.equals(cPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama iptal edildi. ");
            }
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }
}
