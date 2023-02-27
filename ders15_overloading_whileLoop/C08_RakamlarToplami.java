package ders15_overloading_whileLoop;

public class C08_RakamlarToplami {
    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi=1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi!=0){

            birlerBasamagi=sayi%10;             // burada birler basmagi bulunur
            rakamlarToplami+=birlerBasamagi;    // burada birler basamagi rakamlar toplamina eklenir
            sayi/= 10;                          // burada da sayiyi 10 bolup guncelledik
        }

        System.out.println(rakamlarToplami);
    }
}
