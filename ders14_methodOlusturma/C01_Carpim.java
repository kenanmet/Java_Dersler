package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    public static void main(String[] args) {
        // main method icerisinde kullanicidan iki sayi alin
        // bu iki sayiyi parametre olarak kabul edip, carpimlarini main method'a donduren bir method olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lufen iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println(carpimMethodu(sayi1,sayi2));

    }

    public static double carpimMethodu(double sayi1, double sayi2){

        return sayi1*sayi2;

    }
}
