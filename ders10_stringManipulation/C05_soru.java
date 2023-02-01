package ders10_stringManipulation;

public class C05_soru {
    public static void main(String[] args) {

        /*
        mail kontrolu yapan bir program hazirlayin
        - mail @ icermiyorsa "gecersiz mail"
        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        seklinde sonuc yazdirin.
         */

        String email= "kenanmet.com";

        if (!email.contains("@")){
            System.out.println("gecersiz giris");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");
        }else {
            System.out.println("email basari ile kaydedildi");
        }
    }
}
