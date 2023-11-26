public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 6, 7, 12, 7, 9, 3};
        double harmonicSeries = 0.0;

        for (int number : numbers) {
            harmonicSeries += 1.0 / number;
        }

        double harmonicAverage = numbers.length / harmonicSeries;

        System.out.println("Harmonik Ortalama : " + harmonicAverage);

    }
}

