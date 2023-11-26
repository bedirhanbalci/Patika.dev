import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, nFact = 1;
        int r, rFact = 1;
        int nrFact = 1;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n Sayısını Giriniz : ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }

        System.out.print("r Sayısını Giriniz : ");
        r = scanner.nextInt();

        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            nrFact *= i;
        }

        c = nFact / (rFact * (nrFact));

        System.out.println(n + " faktöriyel : " + nFact);
        System.out.println(r + " faktöriyel : " + rFact);
        System.out.println("n-r faktöriyel : " + nrFact);
        System.out.println("C(n,r) : " + c);

    }
}
