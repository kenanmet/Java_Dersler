package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArttirma;
import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {
        // verilen bir int[] 'in elementlerini 2 arttirin.

        int[] arr={2,3,4};
        arr=C03_ArrayElementleriniArttirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]


        // arr array'inin elementlerini toplayip sonuc yazdirin.
        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr)); // 15

        // arr array'inde 10 element olarak var mi?
        C05_ArraydeElemanArama.elemanAra(arr,10); // aranan eleman array'de yok

        // Kullanicidan deger alarak bir array olusturun
        int[] yeniArr=C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));

    }
}
