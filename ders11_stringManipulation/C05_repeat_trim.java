package ders11_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str= "Java guzeldir ";

        System.out.println(str.repeat(4));
        //Java guzeldir Java guzeldir Java guzeldir Java guzeldir



        str= "     Java Guzeldir    ";
        System.out.println(str.length()); // 22


        str=str.trim();  // trim sadece bastaki ve sondaki bosluklari siler.

        System.out.println(str);
        System.out.println(str.length()); // 13


    }
}
