package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soy isminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("Isminiz :" + isim + "\nSoyisminiz :" + soyisim +
                "\nyasiniz :" + yas);
    }
}
