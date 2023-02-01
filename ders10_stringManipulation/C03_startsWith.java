package ders10_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str= "her kusun eti yenmez";

        //Bir String’in baska bir String ile baslayip, baslamadigini kontrol eder,
        // boolean sonuc döndürür.

        System.out.println(str.startsWith("kus")); // false   str kus ile mi basliyor? yanlis

        System.out.println(str.startsWith("her")); // true

        System.out.println(str.startsWith("h")); // true

        System.out.println(str.startsWith("her kusun eti yenmez")); // true

        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("kusun", 4)); //  dorduncu indeksten sonrasi kusun
        // ile mi basliyor bunun olayi da bu.

        System.out.println(str.startsWith("er",2));
    }
}
