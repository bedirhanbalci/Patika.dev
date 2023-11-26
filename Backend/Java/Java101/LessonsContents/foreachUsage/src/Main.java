public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
//        System.out.println(sum);


        String[] cars = {"BMW", "Mercedes", "Audi"};
        for (String car : cars) {
//            System.out.println(car);
        }


        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

//        for (int i = 0; i < matris.length; i++) {
//            for (int j = 0; j < matris[i].length; j++) {
//                System.out.print(matris[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int[] row : matris) {
            for (int col : row) {
//                System.out.print(col + " ");
            }
//            System.out.println();
        }


        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 243, 218, 189, 221, 290};
        for (int score : scores) {
            System.out.print(score + " ");
        }


    }
}