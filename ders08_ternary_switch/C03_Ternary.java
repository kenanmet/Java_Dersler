package ders08_ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a= 5;
        /*
        Ternary apreatoru tek basina kullanilamaz
        ternary bize bir sonuc verir
        bu sonucu ya direk yazdirmali ya da bir variable'a atamaliyiz
         */

        String sonuc = a%2==0 ? "cift sayi" : "tek sayi";


        /*
        Ternary'nin sonucunu bir variable'a atayacaksak
        true ve false durumlarinda uretilecek sonucun
        ayni data turune uygun olmasi gerekir.
        Aksi halde CTE olusur.

        Ama ternary'i sout icinde kullnirsak
        sonuclarin data turunun ayni olmasi sart olmaz
         */

        String sonuc2= a>10 ? "buyuk sayi" : ""+2*a ; // CTE vermemsi icin String'e cevirdik.

        System.out.println(a>10 ? "buyuk sayi" : ""+2*a);
    }
}
