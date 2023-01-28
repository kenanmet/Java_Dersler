package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu girin" +
                "\niki kenar uzunlugu arasinda enter'a basın");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("dikdortgenin alanı : " + kenar1*kenar2);

    }
}
