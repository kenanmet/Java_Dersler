package ders07_nestedIfElseStatements;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //kullaniciya musteri karti olup olmadigini sorun.
        //Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.

        int urunAdedi=30;
        boolean kartVarMi=true;
        double ListeFiyati=12.5;
        double toplamFiyat=0;

        if (kartVarMi && urunAdedi>=10){
            toplamFiyat=urunAdedi*ListeFiyati* (0.8);
            System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);
        } else if (kartVarMi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=urunAdedi*ListeFiyati * (0.85);
        }


    }
}
