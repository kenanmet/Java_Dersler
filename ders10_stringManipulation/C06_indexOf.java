package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        // indexOf
        // Bir String icerisinde aradigimiz bir String veya char degerin
        // ilk kullanim index’ini döndürür.

        String str= "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // ilk kucuk a 'nin kullaniminin index 'ini verir.

        System.out.println(str.indexOf("ile"));

        // cumledeki 2.c'nin index'ini yazdirin

        int ilkcindex= str.indexOf("c");
        System.out.println(str.indexOf("c",ilkcindex+1));


        System.out.println(str.indexOf("Ali")); // index olarak int dondurmeli
        System.out.println(str.indexOf("x")); // olmayan hersey -1 doner.
    }
}
