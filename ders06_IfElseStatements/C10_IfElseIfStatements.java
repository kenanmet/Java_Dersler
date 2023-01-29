package ders06_IfElseStatements;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {

        //soru1 ıf else statements

        char cinsiyet= 'E';
        int yas= 60;

        if (cinsiyet=='E' && yas>60){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("Emekli olabilmek icin daha " + (65-yas) + " sene calismalisin");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("Emekli olmak icin daha " + (60-yas) + " sene calismalisin");
        }else {
            System.out.println("gecersiz giris yaptınız");
        }


    }
}
