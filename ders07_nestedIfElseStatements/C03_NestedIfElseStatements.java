package ders07_nestedIfElseStatements;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        //Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak
        //"Emekli olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.

        char cinsiyet= 'e';
        int yas= 8;

        //Nested If-Else seklinde kullanim icin once ana degisken secip
        //ona gore ana yapiyi olusturalim
        //cinsiyet ana degisken olsun

        if (cinsiyet=='k' || cinsiyet=='K'){
            // giris yapılan deger bir kadina ait demektir.
            if (yas<15){
                System.out.println("Hatali yas girisi");
            } else if (yas<60) {
                System.out.println("Emekli olmak icin daha " + (60-yas) + " yil kadar calismalisin kral");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet=='e' || cinsiyet=='E') {
            // giris yapılan deger bir erkege ait demektir.
            if (yas<15){
                System.out.println("Hatali yas girisi");
            } else if (yas<65) {
                System.out.println("Emekli olmak icin daha " + (65-yas) + " yil kadar calismalisin kral");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else {
            System.out.println("Yanlis cinsiyet girisi");
        }


    }
}
