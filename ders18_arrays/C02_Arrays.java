package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr={"Ali","Ulus","Nesrin"};
        //Bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        // Bu array'i array olarak yazdiralim
        System.out.print(arr); // Array bir obje / non-primitive data oldugundan java referansini yazdirir
                               // [Ljava.lang.String;@566776ad
        // Array'i array olarak yazdirmak istersek Array class'indan yardim alabiliriz
        System.out.println("");
        System.out.print(Arrays.toString(arr)); // Bu sekilde array olarak yazdirir.
    }
}
