import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*      Arrays.toString()
        Diziye ait elemanları direkt ekrana basmak için kullanılan bir metottur.
        Arrays.fill()
        Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.*/

/*       int[] list = {1, 2, 3, 4, 5, 6, 7};
       Arrays.fill(list, 10);
       Arrays.fill(list, 2, 5, 10);

       System.out.println(Arrays.toString(list));*/


/*      Arrays.sort()
        Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.*/
/*        int[] list = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));*/


/*      Arrays.binarySearch()
        Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir. Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.*/

/*       int[] list = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.binarySearch(list, 55));*/


        /*Arrays.copyOf() ve Arrays.copyOfRange() metodu
        Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metodu kullanılır
        Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.*/

/*        int[] list = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyList = Arrays.copyOf(list, 4);
        int[] copyList2 = Arrays.copyOf(list, list.length);
        System.out.println(Arrays.toString(copyList));
        System.out.println(Arrays.toString(copyList2));

        int[] copyList3 = Arrays.copyOfRange(list, 2, 5);
        System.out.println(Arrays.toString(copyList3));*/


        /*Arrays.equals() metotu
        Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.*/


        int[] list = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {3, 5, 3, 5};


        System.out.println(Arrays.equals(list, list2));

        System.out.println(HelperArray.equals(list, list3));


    }
}