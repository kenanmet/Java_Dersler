package ders10_stringManipulation;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1= "java";
        String str2= "Guzeldir";
        boolean bl= true;
        int sayi= 20;
        double dbl= 3.54;

        System.out.println(str1+bl+sayi); // Javatrue20

        // System.out.println(bl+sayi);
        //

        System.out.println(sayi + dbl); // 23.54

        // System.out.println(str1.concat(bl));
        //
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir

    }
}
