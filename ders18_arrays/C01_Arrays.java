package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr1= {2,4,6,8,10};
        // array'in bir elementine ulasmak ve update etmek istersek

        System.out.println(arr1[2]); // arr1'in 2.index'ini yazdirir '6'

        arr1[3]=20; // burada 3. index'i 20 yaptik

        System.out.println(arr1[3]); // 20

        System.out.println(arr1.length);


        // son elementi yazdirin
        System.out.println(arr1[arr1.length-1]);

        // arry'in tum elementlerini yazdirin
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i] +" ");
        }

        // array'in uzunlugu sonradan degistirilmez
        // eger array'de olmayan bir index'e atama yapmak isterseniz
        // ArrayIndexOutOfBoundsException hatasi verir
        // bu hata Compile Time Error CTE degil
        // Run Time error'dur
        // arr1[15]=35;  bunu yazdigimizda calistirmadan bir sorun gorunmez ama calisinca hata verir.
    }
}
