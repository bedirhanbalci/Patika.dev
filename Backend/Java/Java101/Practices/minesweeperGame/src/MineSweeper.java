import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String[][] mineMap;
    String[][] gameMap;
    int mineCount;


    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineCount = (colNumber * rowNumber) / 4;
        this.mineMap = new String[rowNumber][colNumber];
        this.gameMap = new String[rowNumber][colNumber];
    }

    public void run() {
        System.out.println("========== Mayın Tarlası Oyununa Hoş Geldiniz ==========");
        randomMineMaker();
        printMineMap();
        playCheck();
    }

    private void randomMineMaker() {
        Random random = new Random();

        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.gameMap[i][j] = "-";
                this.mineMap[i][j] = "-";
            }
        }
        while (this.mineCount > 0) {
            int rowMineNumber = random.nextInt(this.rowNumber);
            int colMineNumber = random.nextInt(this.colNumber);

            if (this.mineMap[rowMineNumber][colMineNumber].equals("-")) {
                this.mineMap[rowMineNumber][colMineNumber] = "*";
                this.mineCount--;
            }
        }
    }

    private void printMineMap() {
        for (String[] row : this.mineMap) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private void printGameMap() {
        for (String[] row : this.gameMap) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public boolean checkWin() {
        int emptyCell = 0;
        int minedCell = 0;
        for (int i = 0; i < this.mineMap.length; i++) {
            for (int j = 0; j < this.mineMap[i].length; j++) {
                if (this.gameMap[i][j].equals("-")) {
                    emptyCell++;
                }
                if (this.mineMap[i][j].equals("*")) {
                    minedCell++;
                }
            }
        }
        if (emptyCell == minedCell) {
            return false;
        }
        return true;
    }

    private void playCheck() {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;
        while (!finish) {
            System.out.print("Satır Giriniz : ");
            int selectedRow = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int selectedCol = scanner.nextInt();

            this.mineCount = 0;

            if (selectedRow < this.rowNumber && selectedCol < this.colNumber) {
                if (this.mineMap[selectedRow][selectedCol].equals("-") && this.gameMap[selectedRow][selectedCol].equals("-")) {
                    for (int i = selectedRow - 1; i < selectedRow + 2; i++) {
                        for (int j = selectedCol - 1; j < selectedCol + 2; j++) {
                            if (i >= 0 && j >= 0 && i < this.rowNumber && j < this.colNumber && this.mineMap[i][j].equals("*")) {
                                this.mineCount++;
                                this.gameMap[selectedRow][selectedCol] = Integer.toString(this.mineCount);
                            } else {
                                this.gameMap[selectedRow][selectedCol] = Integer.toString(this.mineCount);
                            }

                        }

                    }
                    printGameMap();
                    if (!checkWin()) {
                        System.out.println("Oyunu Kazandınız. Tebrikler!");
                        printMineMap();
                        finish = true;
                    }
                } else if (this.mineMap[selectedRow][selectedCol].equals("*")) {
                    System.out.println("Kaybettiniz. Tekrar Deneyin!");
                    printMineMap();
                    finish = true;
                } else if (!this.gameMap[selectedRow][selectedCol].equals("-")) {
                    System.out.println("Önceden işaretlenmiş alanı seçtiniz! Başka bir alan seçin.");
                }
            } else {
                System.out.println("Satır için : " + this.rowNumber + " - Sütun için : " + this.colNumber + "  değerlerine kadar seçim yapın!");
            }
        }
    }
}