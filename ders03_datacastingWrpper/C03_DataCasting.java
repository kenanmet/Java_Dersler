package ders03_datacastingWrpper;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin
        // Kullanici kaç girerse girsin
        // konsola -128 ile +127 arasinda bir sonuc yazdiracak
        // kod yazin

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir tamsayi giriniz");

        int girilenSayi = scan.nextInt();


        byte donusensayi = (byte)girilenSayi;

        System.out.println("girdiginiz " + girilenSayi + "'nin donusmus hali : " + donusensayi);


    }
}
