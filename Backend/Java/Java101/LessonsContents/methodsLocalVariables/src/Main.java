public class Main {

    // değişkenler tanımlandıkları kod bloklarına aitlerdir
    // bunlara da local değişkenler diyoruz!

    static void sum(int n1, int n2) {
        int a = 25;
        System.out.println(a);
    }

    static void diff() {
        int a = 15;
        System.out.println(a);
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        sum(a, b);
        System.out.println(a);
        
    }
}