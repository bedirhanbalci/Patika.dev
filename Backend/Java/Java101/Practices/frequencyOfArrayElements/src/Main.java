import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar sayıları");

        for (int i = 0; i < list.length; i++) {
            int number = list[i];
            int index = 0;

            if (number == 0) {
                continue;
            }

            for (int j = 0; j < list.length; j++) {
                if (number == list[j]) {
                    index++;
                    list[j] = 0;
                }
            }
            System.out.println(number + " sayısı " + index + " kere tekrar edildi.");
        }
    }
}

