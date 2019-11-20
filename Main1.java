/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;
import java.nio.file.WatchEvent;
import java.util.Scanner;
import java.util.ArrayList;
import sun.security.util.Length;
/**
 *
 * @author yusuf
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Kitap1> k1 =new ArrayList<>();
        
        
        Roman y[];
        y = new Roman[2];
        Roman Serguzest = new Roman();/* */
        y[0]=Serguzest;
       
        Kitap1 kaynakca1 = new Kitap1("Russel","Bertnard" ,"Bilimden Beklediklerimiz (Te.)Avni Yahalioglu","İstanbul " ,1962,131,47 ,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200);
        Kitap1 kaynakca2 = new Kitap1("Meriç","Cemil" ,"Kulturden Irfana","Istanbul" ,1988,25,53,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200 );
        Kitap1 kaynakca3 = new Kitap1("Lahlabi ","Muhammed Aziz" ,"Kapalidan Aciga Milli Kültürler ve Insani Medeniyet,Türkcesi:Bahaeddin Yediyildiz ","Ankara " ,1996,14 ,54,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200  );
        Kitap1 kaynakca4 = new Kitap1("Uygur","Nermin" ,"Kültür Kavrami","İstanbul " ,1984,17,55 ,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200 );
        Kitap1 kaynakca5 = new Kitap1("Watt","Montgomery" ,"İslam'ın Avrupa ' ya Tesiri , Ter. Hulusi Yavuz","İstanbul " ,1986,83 ,78,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200 );
        Kitap1 kaynakca6 = new Kitap1("Danişmend","İsmail Hami" ,"İslam Medeniyeti","İstanbul " ,1982,16 ,89,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200 );
        Kitap1 kaynakca7 = new Kitap1("Ozakpınar","Yılmaz" ,"Kültür ve Medeniyet Anlayışları ve Bir Medeniyet Teorisi","İstanbul " ,1997,69,89,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200  );
        Kitap1 kaynakca8 = new Kitap1("Durant","Will" ,"İslam Medeniyeti , Ter. Orhan Bahaeddin","İstanbul " ,1986,89 ,90,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200 );
        Kitap1 kaynakca9 = new Kitap1("Hunke","Sıgrid" ,"İslam Güneşi, Ter.Servet Sezgin","İstanbul " ,1975,245,90,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi" ,200 );
        Kitap1 kaynakca10 = new Kitap1("Watt","Montgomery" ,"İslam'ın Avrupa ' ya Tesiri ","İstanbul " ,1986,34,93,"Medeniyetimizin Analizi ve Gelecegi","Mehmed Niyazi",200  );
        
        
        
        k1.add(kaynakca1);
        k1.add(kaynakca2);
        k1.add(kaynakca3);
        k1.add(kaynakca4);
        k1.add(kaynakca5);
        k1.add(kaynakca6);
        k1.add(kaynakca7);
        k1.add(kaynakca8);
        k1.add(kaynakca9);
        k1.add(kaynakca10);
        
        y[0].setKitap_Adi(kaynakca1.getKitap_Adi());
        y[0].setSayfa_sayisi(kaynakca1.getSayfa_sayisi());
        y[0].setYazari(kaynakca1.getYazari());
      
      
        System.out.println("1-Kitabin Kaynakçalarini Listele:");
        System.out.println("2-Kaynakçaların Bulunduğu Sayfalar:");
        System.out.println("3-Kaynakça Silmek İstiyorsanız : ");
        System.out.println("4-Yeni Kitap ve Kaynakca Eklemek İstiyorsaniz :");
        Scanner girdi = new Scanner(System.in);
        Scanner girdi1 = new Scanner(System.in);
        
        int secim;
        secim = girdi.nextInt();
       
        switch(secim){
            case 1:
                System.out.println(">>>>KAYNAKÇASI<<<<");
                int k = 1;
                for(Kitap1 i:k1)
                    if(k<=10){
                        System.out.println(k+"."+i.Kaynakca());
                        k++;
                        
                    }
                   
            break;
            
            case 2:
                k=1;
                for(Kitap1 i:k1){
                    if(k<=10){
                        System.out.println(k+". Kaynakçanın Bulunduğu Sayfa : "+i.getKacinci_sayfa());
                        k++;
                    } 
                }
            break;
            
            case 3: 
                int arama;
                
                System.out.println("Kacinci Kaynakçayı Silmek İstiyorsunuz :");
                arama = girdi1.nextInt();
                
                k1.remove(arama-1);/* Girdigimiz sayi silmek istediğimiz kaynakcanın indexinin 1 fazlası olduğu için bir çıkarıyoruz  */
                
                System.out.println(">>>>Son Durumdaki Kaynakça<<<<");
                
                k=1;
                
                for(Kitap1 i:k1){
                    if(k<=10){
                        
                        System.out.println(k+"."+i.Kaynakca());/* Sildikten sonra kaynakcanin son halini verir */
                        
                        k++;
                        
                    }
                }
            break;
            
           
            case 4 :
                
                
                String k_adi;
                String yazari;
                int sayfa_sayisi;
                String soyad;
                String ad;
                String kitap;
                String basildigi_il;
                int yil;
                int sayfasi;
                int kacinci_sayfa;
                
                Roman yeni_kitap;
                yeni_kitap = new Roman();/* Yeni bir kitap olusturuyoruz*/
                
                Kitap1 kaynak[];
                kaynak = new Kitap1[2];
                Kitap1 kaynak1 = new Kitap1();/* Yeni kaynakca oluşturuyoruz */
                
                
                System.out.println("-----Kitap Bilgilerini Giriniz-----");
                
                System.out.println("Kitabın İsmini Giriniz :");
                k_adi = girdi.next();
                System.out.println("Kitap Yazari :");
                yazari = girdi.next();
                System.out.println("Sayfa Sayisi ");
                sayfa_sayisi=girdi.nextInt();
                
                
                y[1]=yeni_kitap;
                yeni_kitap.setKitap_Adi(k_adi);
                yeni_kitap.setYazari(yazari);
                yeni_kitap.setSayfa_sayisi(sayfa_sayisi);
                yeni_kitap.Bilgiler();
                
                System.out.println("-----Kaynakca Bilgilerini Giriniz-----");
          
                System.out.println("Yazar Soyad");
                soyad = girdi.next();
                System.out.println("Yazar Ad");
                ad = girdi.next();
                System.out.println("Kitap Ad");
                kitap = girdi.next();
                System.out.println("Basildigi il : ");
                basildigi_il = girdi.next();
                System.out.println("Basildigi yil :");
                yil = girdi.nextInt();
                System.out.println("Sayfa Numarasi : ");
                sayfasi = girdi.nextInt();
                System.out.println("Kaynakcanin Kitaptaki Sayfasi :");
                kacinci_sayfa = girdi.nextInt();
                
                
                kaynak[0]=kaynak1;
                kaynak[0].setSoyad(soyad);
                kaynak[0].setAd(ad);
                kaynak[0].setKitap(kitap);
                kaynak[0].setBasildigi_il(basildigi_il);
                kaynak[0].setYil(yil);
                kaynak[0].setSayfasi(sayfasi);
                kaynak[0].setKacinci_sayfa(kacinci_sayfa);
                
               
                k=1;
                
                
                
                int tane,i ;
                
                
                System.out.println("Kac Tane Daha Kaynakca Eklemek İstiyorsunuz  : ");
                tane =girdi.nextInt();
                if(tane ==0){/* eğer daha eklemek istemiyorsak */ 
                    for(Kitap1 in:kaynak){
                    
                        
                    System.out.println(k+"."+in.Kaynakca());/* yukarida girdigimiz kaynakcayi yazdiriyoruz */
                    k++;    
                    
                        
                }
                }else{
                    for(i=1;i<=tane;i++){
                        kaynak[i]=new Kitap1(); /* yeni kaynakca nesnesi oluşturuyoruz */
                        System.out.println("Yazar Soyad");
                        soyad = girdi.next();
                        System.out.println("Yazar Ad");
                        ad = girdi.next();
                        System.out.println("Kitap Ad");
                        kitap = girdi.next();
                        System.out.println("Basildigi il : ");
                        basildigi_il = girdi.next();
                        System.out.println("Basildigi yil :");
                        yil = girdi.nextInt();
                        System.out.println("Sayfa Numarasi : ");
                        sayfasi = girdi.nextInt();
                        System.out.println("Kaynakcanin Kitaptaki Sayfasi :");
                        kacinci_sayfa = girdi.nextInt();

                        kaynak[i].setSoyad(soyad);
                        kaynak[i].setAd(ad);
                        kaynak[i].setKitap(kitap);
                        kaynak[i].setBasildigi_il(basildigi_il);
                        kaynak[i].setYil(yil);
                        kaynak[i].setSayfasi(sayfasi);
                        kaynak[i].setKacinci_sayfa(kacinci_sayfa);
                        for(Kitap1 in:kaynak){


                        System.out.println(k+"."+in.Kaynakca());
                        k++;    


                    }
                    }
                    System.out.println("-----Kaynakca Bilgileri-----");
                }
                for(i=0;i<=tane;i++){/* Yeni Kitabımızın Kaynakca Bilgileri */
                    System.out.println("\n");
                    kaynak[i].Bilgiler();
                }
              
            break;   
                
        }
            
          
    }
            
        
    }
    

