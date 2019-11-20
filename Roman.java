/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author yusuf
 */
class Roman {
    private String kitap_Adi;
    private String yazari;
    private int sayfa_sayisi;
    
    public Roman(){
        this.kitap_Adi=" ";
        this.yazari=" ";
        this.sayfa_sayisi=0;
    }

    public Roman(String kitap_Adi, String yazari, int sayfa_sayisi) {
        this.kitap_Adi = kitap_Adi;
        this.yazari = yazari;
        this.sayfa_sayisi = sayfa_sayisi;
    }

    public String getKitap_Adi() {
        return kitap_Adi;
    }

    public void setKitap_Adi(String kitap_Adi) {
        this.kitap_Adi = kitap_Adi;
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        this.yazari = yazari;
    }

    public int getSayfa_sayisi() {
        return sayfa_sayisi;
    }

    public void setSayfa_sayisi(int sayfa_sayisi) {
        this.sayfa_sayisi = sayfa_sayisi;
    }
    public void Bilgiler(){
        
        System.out.println("Kitap Adi : "+kitap_Adi );
        System.out.println("Yazari : "+yazari);
        System.out.println("Sayfa Sayiisi : "+ sayfa_sayisi);
    }
    
    
    

    
    
}
