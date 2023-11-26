import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "patika";
        String newStr = "PATİKA.dev";
        String trimString = "   PATİKA.dev şirketi  ";
        String patika = "paTİka";
        String text = "";
        String[] sp = str.split("a");


        System.out.println("Belirtilen indisteki karakteri verir : " + str.charAt(2));
        System.out.println("Belirtilen indisteki karakterin unicode'unu verir : " + str.codePointAt(1));
        System.out.println("Belirtilen indisten önceki karakterin unicode'unu verir : " + str.codePointBefore(1));
        System.out.println("İki dizeyi unicode değerleri olarak karşılaştırır (eşitlerse '0' değerini alırız değillerse farklı bir sayı alırız) : " + str.compareTo(patika));
        System.out.println("BÜYÜK KÜÇÜK harf farklılıklarını göz ardı ederek iki dizenin unicode değerlerini karşılaştırır. : " + str.compareToIgnoreCase(patika));
        System.out.println("Başka bir stringin sonuna ekleme yapma : " + str.concat(".dev"));
        System.out.println("Biz dizenin bir dizi karakter içerip içermediğini kontrol eder. (true-false döndürür) : " + str.contains("ti"));
        System.out.println("Bir dizenin belirtilen karakter (ler) ile bitip bitmediğini kontrol eder (true-false döndürür) : " + str.endsWith("ka"));
        System.out.println("Bir dizenin belirtilen karakter (ler) ile başlayıp başlamadığını kontrol eder : " + str.startsWith("pa"));
        System.out.println("İki dizgiyi karşılaştırır. Dizeler eşitse true değilse false döner : " + str.equals("patika"));
        System.out.println("BÜYÜK KÜÇÜK harf farklılıklarını göz ardı ederek iki dizgiyi karşılaştırır : " + str.equalsIgnoreCase("PAtiKA"));
        System.out.println("Bir dizede belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir (soldan sağa bakılır) : " + str.indexOf("a"));
        System.out.println("Bir dizede belirtilen karakterlerin son bulunan oluşumunun konumunu verir (yine soldan sağa bakılır) : " + str.lastIndexOf("a"));
        System.out.println("Bir dizenin boş olup olmadığını kontrol eder : " + text.isEmpty());
        System.out.println("Belirtilen bir dizenin uzunluğunu verir : " + str.length());
        System.out.println("Belirli bir değer için bir dize arar ve belirtilen değerlerin değiştirildiği yeni bir dize döndürür : " + str.replace("a", "o"));
        System.out.println("Belirli bir değer için bir dize arar ve belirtilen değerlerin ilkini değiştirir : " + str.replaceFirst("a", "o"));
        System.out.println("replace gibi çalışır ama içerisine regex ifadelerinin eklenmesiyle kullanım şekli değiştirileiblir : " + str.replaceAll("a", "o"));
        System.out.println("Bir dizeyi bir alt dizeye böler : " + Arrays.toString(sp));
        System.out.println("Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak ve belirtilen karakter sayısıyla ayıklar : " + str.substring(2));
        System.out.println("Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak ve belirtilen karakter sayısıyla ayıklar : " + newStr.substring(2, 6));
        System.out.println("Bir dizeyi küçük harflere dönüştürür : " + newStr.toLowerCase());
        System.out.println("Bir dizeyi büyük harflere dönüştürür : " + newStr.toUpperCase());
        System.out.println("Bir dizenin her iki ucundaki boşluğu kaldırır : " + trimString.trim());
    }
}