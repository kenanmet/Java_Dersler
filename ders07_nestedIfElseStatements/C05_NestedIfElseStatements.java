package ders07_nestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        //Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.

        int urunAdedi=25;
        boolean kartVarMi=false;
        double ListeFiyati=20;
        double toplamFiyat=0;

        //ana degisken kart olsun

        if (kartVarMi){
            //kart var
            if (urunAdedi<0){
                System.out.println("hatali urun adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat= urunAdedi*ListeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat " + toplamFiyat + " tl");
            }else {
                toplamFiyat= urunAdedi*ListeFiyati*0.80;
                System.out.println("%20 indirimli toplam fiyat " + toplamFiyat + " tl");
            }

        }else {
            //kart yok
            if (urunAdedi<0){
                System.out.println("hatali urun adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat= urunAdedi*ListeFiyati*0.90;
                System.out.println("%10 indirimli toplam fiyat " + toplamFiyat + " tl");
            }else {
                toplamFiyat= urunAdedi*ListeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat " + toplamFiyat + " tl");
            }
        }


    }
}
