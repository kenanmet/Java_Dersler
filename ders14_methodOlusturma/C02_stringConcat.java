package ders14_methodOlusturma;

public class C02_stringConcat {
    // verilen iki string'i parametre olarak kabul edip
    // bu iki string'i aralarinda bir bosluk olan tek bir string olarak
    // main method'a donruren bir method olusturun

    public static void main(String[] args) {

        String str1="Kenan";
        String str2="MET";

        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("bu da","tamam"));

    }

    public static String birlestirMethodu(String str1, String str2){

        return str1 +" "+ str2;
    }
}
