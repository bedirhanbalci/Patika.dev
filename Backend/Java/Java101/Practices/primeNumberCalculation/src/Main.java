public class Main {
    public static void main(String[] args) {

        int index;
        for (int i = 2; i < 100; i++) {
            index = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    index++;
                }

            }
            if (index == 0) {
                System.out.println(i);
            }

        }

    }
}
