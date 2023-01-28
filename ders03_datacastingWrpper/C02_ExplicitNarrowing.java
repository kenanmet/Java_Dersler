package ders03_datacastingWrpper;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi= 20;

        /*
        genis data turundeki bir degeri
        dar data turundeki bir variable'a atmak istersek
        java sorumlulugu almamizi ister.

        bu sorumlulugu almak ici
        cast edecegimiz degerin onune () icerisinde
        cast etmek istedigimiz data turu yazilir.

        ancak bu durumda data kayipları (double'den int'e gecerken virgulden sonrasi silinir)
        veya baskalasim olabilir
         */
        short sh= (short)sayi;

        System.out.println(sh); // 20


        double dbl = 23.5;

        int say= (int)dbl;

        System.out.println(say); // 23


        say= 256; // int

        byte byt= (byte)say;

        System.out.println(byt); // 0

    }
}
