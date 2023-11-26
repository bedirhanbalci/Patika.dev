public class Main {
    public static void main(String[] args) {

        System.out.println("Mutlak Değer : " + Math.abs(-100));
        System.out.println("Küp Kök : " + Math.cbrt(8));
        System.out.println("Bir üst tam sayıya yuvarlama : " + Math.ceil(1.12));
        System.out.println("Bir alt tam sayıya yuvarlama : " + Math.floor(1.52));
        System.out.println("En yakın tam sayıya yuvarlama (int döner) : " + Math.round(1.63));
        System.out.println("En yakın tam sayıya yuvarlama (double döner) : " + Math.rint(1.63));
        System.out.println("Sayının işaretini verir (-1 veya +1) : " + Math.signum(-14.47));
        System.out.println("log10 tabanında hesaplama : " + Math.log10(100));
        System.out.println("Max Hesaplama : " + Math.max(100, 200));
        System.out.println("Min Hesaplama : " + Math.min(100, 200));
        System.out.println("Üs Alma : " + Math.pow(2, 3));
        System.out.println("Karekök Alma : " + Math.sqrt(16));
        System.out.println("Normalde 0 ile 1 arasında rastgele bir değer üretir. 100 ile çarparsan 0-99 arası değerler üretir : " + Math.random() * 100);
        System.out.println("101 ile çarparsan 0-100 arası değerler üretir : " + Math.random() * 101);
    }
}