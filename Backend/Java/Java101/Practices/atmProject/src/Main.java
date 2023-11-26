import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Switch-Case ile Çözümü

        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        String correctUsername = "patika";
        String correctPassword = "dev123";

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            String userName = scanner.nextLine();
            System.out.print("Parolanız: ");
            String password = scanner.nextLine();

            if (userName.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoş geldiniz!");

                while (true) {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    int select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı: ");
                            int price = scanner.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para Miktarı: ");
                            int price2 = scanner.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                balance -= price2;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar bekleriz!");
                            return;
                        default:
                            System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
                            break;
                    }
                }
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz!");
                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }


//        If-Else If ile Çözümü

//        Scanner scanner = new Scanner(System.in);
//        int right = 3;
//        int balance = 1500;
//        String correctUsername = "patika";
//        String correctPassword = "dev123";
//
//        while (right > 0) {
//            System.out.print("Kullanıcı Adınız: ");
//            String userName = scanner.nextLine();
//            System.out.print("Parolanız: ");
//            String password = scanner.nextLine();
//
//            if (userName.equals(correctUsername) && password.equals(correctPassword)) {
//                System.out.println("Merhaba, Kodluyoruz Bankasına Hoş geldiniz!");
//
//                while (true) {
//                    System.out.println("1-Para Yatırma\n" +
//                            "2-Para Çekme\n" +
//                            "3-Bakiye Sorgula\n" +
//                            "4-Çıkış Yap");
//                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
//                    int select = scanner.nextInt();
//
//                    if (select == 1) {
//                        System.out.print("Para Miktarı: ");
//                        int price = scanner.nextInt();
//                        balance += price;
//                        System.out.println("Yeni bakiyeniz: " + balance);
//                    } else if (select == 2) {
//                        System.out.print("Para Miktarı: ");
//                        int price = scanner.nextInt();
//                        if (price > balance) {
//                            System.out.println("Bakiye yetersiz!");
//                        } else {
//                            balance -= price;
//                            System.out.println("Yeni bakiyeniz: " + balance);
//                        }
//                    } else if (select == 3) {
//                        System.out.println("Bakiyeniz: " + balance);
//                    } else if (select == 4) {
//                        System.out.println("Tekrar bekleriz!");
//                        break;
//                    } else {
//                        System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
//                    }
//                }
//                break;
//            } else {
//                right--;
//                if (right == 0) {
//                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz!");
//                } else {
//                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
//                    System.out.println("Kalan hakkınız: " + right);
//                }
//            }
//        }
    }
}