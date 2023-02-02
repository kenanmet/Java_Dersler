package ders14_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // bu iki sayinin carpim sonucunu yeni bir kod yazmadan konsola yazdirin
        System.out.println(C01_Carpim.carpimMethodu(a, b));


        String c="Nasil";
        String d="Yani";
        // bu iki string'i aralarinda bir bosluk birakarak yazdirin
        System.out.println(C02_stringConcat.birlestirMethodu(c, d));


        String e="kaslarin arasindan domdom kursunu degdi";
        // e String'ini tersten yazdirin
        System.out.println(C03_StringTerseCevirme.terseCevirMethodu(e));
    }
}
