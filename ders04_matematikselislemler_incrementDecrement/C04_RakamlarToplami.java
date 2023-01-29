package ders04_matematikselislemler_incrementDecrement;

public class C04_RakamlarToplami {
    public static void main(String[] args) {
        // kullanicinin girdigi 4 basamakli bir sayinin
        // rakamlar toplamni veren bir kod yaziniz.

        int input= 1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        // 1- birler basamagini al
        birlerBasamagi = input % 10; //3
        // 2- birler basamagini rakamlar toplamina ekle
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //3
        // 3- birler basamagindan kurtul
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input /10;

        System.out.println("verilen sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
