import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total, pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, eggplant = 5.0;

        System.out.print("How many kilos of pears ? : ");
        pear *= input.nextDouble();

        System.out.print("How many kilos of apples ? : ");
        apple *= input.nextDouble();

        System.out.print("How many kilos of tomatoes ? : ");
        tomatoes *= input.nextDouble();

        System.out.print("How many kilos of bananas ? : ");
        banana *= input.nextDouble();

        System.out.print("How many kilos of eggplant ? : ");
        eggplant *= input.nextDouble();

        total = pear + apple + tomatoes + banana + eggplant;
        System.out.println("Total Amount You Have to Pay :" + total + "TL");
    }
}
