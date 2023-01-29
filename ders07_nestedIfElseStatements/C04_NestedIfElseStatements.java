package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        //Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak
        //"Emekli olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.


        //Ana degisken yas olsun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("Lutfen cinsiyetinizi giriniz E/K");
        char cinsiyet=scan.next().charAt(0);

        if (yas<15){
            System.out.println("Hatali giris yaptiniz");
        } else if (yas<60) {
            // emekli olamaz, calismasi gereken sure yas'a bagli
            System.out.println("emekli olamazsin");
            if (cinsiyet=='K' || cinsiyet=='k');
        } else if (yas<65) {
            //kadin ise emekli olabilir, erkek calismasi lazim

        }else {// yas 65 ten buyukse
            System.out.println("emekli olabilirsin");
        }
    }
}
