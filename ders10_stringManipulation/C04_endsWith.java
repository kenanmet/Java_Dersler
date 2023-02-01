package ders10_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String str = "Java heryerde guzel";

        // Bir String’in baska bir String ile bitip, bitmedigini kontrol eder,
        // boolean sonuc döndürür.

        System.out.println(str.endsWith("guzel")); // true

        System.out.println(str.endsWith("heryerde")); // false

    }
}
