package ders14_methodOlusturma;

public class C03_StringTerseCevirme {

    // parametre olarak bir string kabul edip
    // String'in terse cevrilmis halini donduren bir method olusturun

    public static void main(String[] args) {
        String input="Java kod yazmadan ogrenilmez";

        System.out.println(terseCevirMethodu(input));
    }



    public static String terseCevirMethodu(String input){

        String tersInput="";

        for (int i = input.length()-1; i >= 0 ; i--) {
            tersInput=tersInput+input.charAt(i);
        }
        return tersInput;
    }
}
