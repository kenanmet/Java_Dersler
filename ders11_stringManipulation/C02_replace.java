package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java candir";

        System.out.println(str.replace('a', 'A')); // JAvA cAndir
        System.out.println(str.replace(' ','_')); // Java_candir

        System.out.println(str.replace("candir","cok guzel")); // Java cok guzel
        System.out.println(str.replace(" ","")); // Javacandir

        System.out.println(str.replace("a","")); // Jv cndir

        // Java yerine hava, candir yerine cok guzel yadiralim

        System.out.println(str.replace("Java","Hava")
                              .replace("candir","cok guzel")); // Hava cok guzel

        // Sadece 1.a'yi A yapalim.

        System.out.println(str.replaceFirst("a", "A")); // JAva candir

        System.out.println(str.replace("","_")); // _J_a_v_a_ _c_a_n_d_i_r_

    }
}
