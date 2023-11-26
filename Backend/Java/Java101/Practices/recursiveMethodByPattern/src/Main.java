public class Main {
    static void recursiveIslem(int number, int originalNumber) {
        if (number <= 0) {
            System.out.println("Son Değer : " + number);
            addPrint(number, originalNumber);

        } else {
            System.out.println("Son Değer : " + number);
            recursiveIslem(number - 5, originalNumber);
        }
    }

    static void addPrint(int number, int originalNumber) {
        if (number < originalNumber) {
            number = number + 5;
            System.out.println("Son Değer : " + number);
            addPrint(number, originalNumber);
        }
    }

    public static void main(String[] args) {
        int number = 16;
        recursiveIslem(number, number);
    }
}

