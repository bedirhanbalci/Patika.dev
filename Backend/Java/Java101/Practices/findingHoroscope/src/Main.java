import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        month = scanner.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = scanner.nextInt();

        if (month == 1) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 22) {
                    horoscope = "Oğlak";
                } else {
                    horoscope = "Kova";
                }
            } else {
                isError = true;
            }
        }
        if (month == 2) {
            if ((day <= 29) && (day >= 1)) {
                if (day < 20) {
                    horoscope = "Kova";
                } else {
                    horoscope = "Balık";
                }
            } else {
                isError = true;
            }
        }
        if (month == 3) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 21) {
                    horoscope = "Balık";
                } else {
                    horoscope = "Koç";
                }
            } else {
                isError = true;
            }
        }
        if (month == 4) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 22) {
                    horoscope = "Koç";
                } else {
                    horoscope = "Boğa";
                }
            } else {
                isError = true;
            }
        }
        if (month == 5) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 22) {
                    horoscope = "Boğa";
                } else {
                    horoscope = "İkizler";
                }
            } else {
                isError = true;
            }
        }
        if (month == 6) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 23) {
                    horoscope = "İkizler";
                } else {
                    horoscope = "Yengeç";
                }
            } else {
                isError = true;
            }
        }
        if (month == 7) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 24) {
                    horoscope = "Yengeç";
                } else {
                    horoscope = "Aslan";
                }
            } else {
                isError = true;
            }
        }
        if (month == 8) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 23) {
                    horoscope = "Aslan";
                } else {
                    horoscope = "Başak";
                }
            } else {
                isError = true;
            }
        }
        if (month == 9) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 23) {
                    horoscope = "Başak";
                } else {
                    horoscope = "Terazi";
                }
            } else {
                isError = true;
            }
        }
        if (month == 10) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 23) {
                    horoscope = "Terazi";
                } else {
                    horoscope = "Akrep";
                }
            } else {
                isError = true;
            }
        }
        if (month == 11) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 22) {
                    horoscope = "Akrep";
                } else {
                    horoscope = "Yay";
                }
            } else {
                isError = true;
            }
        }
        if (month == 12) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 22) {
                    horoscope = "Yay";
                } else {
                    horoscope = "Oğlak";
                }
            } else {
                isError = true;
            }
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz : " + horoscope);
        }
    }
}