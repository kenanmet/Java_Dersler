package ders10_stringManipulation;

public class C10_isEmpty {
    public static void main(String[] args) {

        // 'isEmpty' Verilen bir String’in bos olup olmadigini boolean olarak döndürür.

        // Bir String’in sadece space’lerden olusmus oldugunu kontrol icin
        // str.isBlank( ) kullanilabilir.
        String str= "";

        System.out.println(str.isEmpty()); // true

        str= "   ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true

        str= "x";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false

    }
}
