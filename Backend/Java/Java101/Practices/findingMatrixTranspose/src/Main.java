public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7},
                {5, 3, 9},
                {8, 2, 4},
                {2, 1, 8}};

        int[][] transpose = new int[matrix[0].length][matrix.length];

        System.out.println("Matris");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Transpoz");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}

