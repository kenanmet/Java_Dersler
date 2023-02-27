package ders18_arrays;

public class C07_EnKisaEnUzunKelime {
    public static void main(String[] args) {
        // Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran
        // bir method olusturun.

        String[] arr={"Hasan,Adem,Ramazan,Kenan Met"};
        enUzunEnKisaIsimYazdir(arr);

    }

    public static void enUzunEnKisaIsimYazdir(String[] arr){

        String enUzunIsim=arr[0];
        String enKisaIsim=arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length()>enUzunIsim.length()){
                enUzunIsim=arr[i];
            }

            if (arr[i].length()<enKisaIsim.length()){
                enKisaIsim=arr[i];
            }

        }
        System.out.println("en kisa isim: " + enKisaIsim);
        System.out.println("en uzun isim: " + enUzunIsim);
    }


}
