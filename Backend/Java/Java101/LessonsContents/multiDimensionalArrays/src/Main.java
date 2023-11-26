import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matris = new int[6][6];
        matris[0][0] = 0;
        matris[2][3] = 839;
//        System.out.println(matris[2][3]);


        int[][] matris2 = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

//        System.out.println(matris2[5][4]);

        int[][] matris3 = new int[3][4];
        int number = 1;
//        System.out.println(matris3.length);
//        System.out.println(matris3[0].length);

        for (int i = 0; i < matris3.length; i++) {
            for (int j = 0; j < matris3[i].length; j++) {
                matris3[i][j] = number++;
            }
        }

        for (int i = 0; i < matris3.length; i++) {
            for (int j = 0; j < matris3[i].length; j++) {
                System.out.print(matris3[i][j] + " ");
            }
            System.out.println();
        }


    }
}