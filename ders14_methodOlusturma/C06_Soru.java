package ders14_methodOlusturma;

public class C06_Soru {
    /*
    Kullanicidan main method icinde  ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
    input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz
     */

    public static void main(String[] args) {
        String isim="KENAN";
        String soyisim="MET";

        System.out.println(isimSoyisimDuzenle(isim, soyisim));
        System.out.println(isimSoyisimDuzenle("ali","veli"));

    }

    public static String isimSoyisimDuzenle(String isim,String soyisim){

        String yeniIsimSoyisim= isim.substring(0,1).toUpperCase()+
                                isim.substring(1).toLowerCase()+
                                " " +
                                soyisim.substring(0,1).toUpperCase()+
                                soyisim.substring(1).toLowerCase();
        return yeniIsimSoyisim;
    }
}
