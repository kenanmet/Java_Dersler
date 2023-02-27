package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        // donduren bir method olusturun.

        int[] kullaniciArrayi=arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));



    }

    public static int[] arrayOlustur(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Olusturulacak array'in boyunu giriniz");
        int length=scan.nextInt();

        int[] kullaniciArrayi= new int[length]; // burasi kullanicinin girdigi length uzunlugunda array olusturur

        for (int i = 0; i < length; i++) {

            System.out.println("Array'e eknecek bir sayi giriniz");
            kullaniciArrayi[i]=scan.nextInt();
        }
        return kullaniciArrayi;
    }

}
