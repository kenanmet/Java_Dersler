package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        //Null pointer bir deger degil isaretcidir.

        String str1= "";
        // str1 'e deger atanmistir.

        System.out.println(str1); // hiclik yazdirir.
        System.out.println(str1.concat("Java")); // Java


        String str2;
        // str2 olusturuldu ama deger atanmadi.

        // System.out.println(str2); // str2 'ye deger atanmadigi icin yazdirilamaz, CTE verir.
        // System.out.println(str2.concat("Java")); // deger atanmadigi icin method 'la kullanilamaz.

        str2="Java candir"; // burada str2 'ye deger atamasi yapildigi icin artik kullanabiliriz.
        System.out.println(str2);
        System.out.println(str2.concat("."));


        String str3=null;   // str3 'e deger atanmamistir.
                            // null pointer ile javaya deger atamadigimizin farkinda oldugumuzu soyluyoruz.

        System.out.println(str3); // null isaretlendigini yazdirir.



    }
}
