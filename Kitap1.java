
package main1;

/**
 *
 * @author yusuf
 */
public class Kitap1 extends Roman{
    private String soyad;
    private String ad;
    private String kitap;
    private String basildigi_il;
    private int yil;
    private int sayfasi;
    private int kacinci_sayfa;
    
    public Kitap1(){
        this.soyad = "";
        this.ad = "";
        this.kitap = "";
        this.basildigi_il = "";
        this.yil = 0;
        this.sayfasi = 0;
        this.kacinci_sayfa = 0;
    }

    public Kitap1(String soyad, String ad, String kitap, String basildigi_il, int yil, int sayfasi, int kacinci_sayfa, String kitap_Adi, String yazari,int sayfa_sayisi) {
        super(kitap_Adi, yazari,sayfa_sayisi);
        this.soyad = soyad;
        this.ad = ad;
        this.kitap = kitap;
        this.basildigi_il = basildigi_il;
        this.yil = yil;
        this.sayfasi = sayfasi;
        this.kacinci_sayfa = kacinci_sayfa;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKitap() {
        return kitap;
    }

    public void setKitap(String kitap) {
        this.kitap = kitap;
    }

    public String getBasildigi_il() {
        return basildigi_il;
    }

    public void setBasildigi_il(String basildigi_il) {
        this.basildigi_il = basildigi_il;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getSayfasi() {
        return sayfasi;
    }

    public void setSayfasi(int sayfasi) {
        this.sayfasi = sayfasi;
    }

    public int getKacinci_sayfa() {
        return kacinci_sayfa;
    }

    public void setKacinci_sayfa(int kacinci_sayfa) {
        this.kacinci_sayfa = kacinci_sayfa;
    }

    
    public String Kaynakca(){
        
        return soyad+" , "+ad+" , "+kitap+" , "+basildigi_il+" , s."+yil;
    }
    @Override
    public void Bilgiler(){
        System.out.println("Adı : "+ad);
        System.out.println("Soyadı : "+soyad);
        System.out.println("Kitabı : "+kitap);
        System.out.println("Basildigi il : "+basildigi_il);
        System.out.println("Kitabin Basim Yili : "+yil);
        
    }
    
}
