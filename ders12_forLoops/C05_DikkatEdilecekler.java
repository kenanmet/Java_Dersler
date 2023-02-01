package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {

        /* Sonsuz Loop

        for (int i = 0; i >-10 ; i++) {
            System.out.print(i+" ");

         */

        // ilk deger icin bitis sarti dogru olmuyorsa
        // for body'si hic devreye giremez
        for (int i = 0; i > 10 ; i++) {
            System.out.println(i);
        }


        // Bir loop'u sonunu beklemden bitirmek istersek

        // Kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun

        int sayi=10300;
        boolean bayrak=false;

        for (int i = 2; i < sayi-1; i++) {

            if (sayi % i==0){

                bayrak= true;
                break; // buraya break koyunca sayi ilk farkli sayiya bolununce program durur.
            }
        }
        System.out.println(bayrak);

        if (bayrak){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }


    }
}
