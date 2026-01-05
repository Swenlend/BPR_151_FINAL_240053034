import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mini Market Otomasyonu - Stok, İndirim ve Kasa Fişi Sistemli
 * Öğrenci Adı Soyadı: Yunusemre Perdi
 * Öğrenci Numarası: 240053034
 * Bölüm: Bilgisayar Programcılığı
 * Bu program market ürünlerini stoklu şekilde yönetir,
 * sepete ürün ekleme/silme işlemleri yapar,
 * indirim uygular ve kasa fişi oluşturur.
 */

public class MiniMarketotomasyonu {

    static Scanner scanner = new Scanner(System.in);

    // Market ürün bilgileri
    static ArrayList<String> urunler = new ArrayList<>();
    static ArrayList<Double> fiyatlar = new ArrayList<>();
    static ArrayList<Integer> stoklar = new ArrayList<>();

    // Sepet bilgileri
    static ArrayList<String> sepetUrunler = new ArrayList<>();
    static ArrayList<Double> sepetFiyatlar = new ArrayList<>();

    // İndirim oranı (yüzde)
    static double indirimOrani = 0;

    public static void main(String[] args) {

        // Başlangıç ürünleri
        urunEkleBaslangic("Ekmek", 5.0, 20);
        urunEkleBaslangic("Süt", 15.0, 15);
        urunEkleBaslangic("Yumurta", 30.0, 10);
        urunEkleBaslangic("Peynir", 60.0, 8);

        int secim;

        while (true) {
            menuGoster();
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    marketUrunleriListele();
                    break;
                case 2:
                    marketUrunEkle();
                    break;
                case 3:
                    marketUrunSil();
                    break;
                case 4:
                    sepeteEkle();
                    break;
                case 5:
                    sepetiGoster();
                    break;
                case 6:
                    sepettenSil();
                    break;
                case 7:
                    toplamTutar();
                    break;
                case 8:
                    indirimUygula();
                    break;
                case 9:
                    kasaFisiYazdir();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor. İyi günler!");
                    return;
                default:
                    System.out.println("Hatalı seçim yaptınız!");
            }
        }
    }

    // Menü
    static void menuGoster() {
        System.out.println("\n--- MINI MARKET OTOMASYONU ---");
        System.out.println("1 - Market Ürünlerini Listele");
        System.out.println("2 - Market Ürün Ekle");
        System.out.println("3 - Market Ürün Sil");
        System.out.println("4 - Sepete Ürün Ekle");
        System.out.println("5 - Sepeti Görüntüle");
        System.out.println("6 - Sepetten Ürün Sil");
        System.out.println("7 - Toplam Tutar");
        System.out.println("8 - İndirim Uygula");
        System.out.println("9 - Kasa Fişi Yazdır");
        System.out.println("0 - Çıkış");
        System.out.print("Seçiminiz: ");
    }

    // Başlangıç ürünleri
    static void urunEkleBaslangic(String ad, double fiyat, int stok) {
        urunler.add(ad);
        fiyatlar.add(fiyat);
        stoklar.add(stok);
    }

    // Market ürünleri
    static void marketUrunleriListele() {
        System.out.println("\nMarket Ürünleri:");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println((i + 1) + " - " + urunler.get(i)
                    + " | Fiyat: " + fiyatlar.get(i) + " TL"
                    + " | Stok: " + stoklar.get(i));
        }
    }

    // Market ürünü ekleme
    static void marketUrunEkle() {
        scanner.nextLine();
        System.out.print("Ürün adı: ");
        String ad = scanner.nextLine();

        System.out.print("Ürün fiyatı: ");
        double fiyat = scanner.nextDouble();

        System.out.print("Ürün stok miktarı: ");
        int stok = scanner.nextInt();

        urunler.add(ad);
        fiyatlar.add(fiyat);
        stoklar.add(stok);

        System.out.println("Ürün markete eklendi.");
    }

    // Market ürünü silme
    static void marketUrunSil() {
        marketUrunleriListele();
        System.out.print("Silmek istediğiniz ürün numarası: ");
        int secim = scanner.nextInt();

        if (secim > 0 && secim <= urunler.size()) {
            urunler.remove(secim - 1);
            fiyatlar.remove(secim - 1);
            stoklar.remove(secim - 1);
            System.out.println("Ürün marketten silindi.");
        } else {
            System.out.println("Geçersiz ürün numarası!");
        }
    }

    // Sepete ekleme (stok kontrolü)
    static void sepeteEkle() {
        marketUrunleriListele();
        System.out.print("Sepete eklemek istediğiniz ürün numarası: ");
        int secim = scanner.nextInt();

        if (secim > 0 && secim <= urunler.size()) {
            if (stoklar.get(secim - 1) > 0) {
                sepetUrunler.add(urunler.get(secim - 1));
                sepetFiyatlar.add(fiyatlar.get(secim - 1));
                stoklar.set(secim - 1, stoklar.get(secim - 1) - 1);
                System.out.println("Ürün sepete eklendi.");
            } else {
                System.out.println("Bu ürün stokta yok!");
            }
        } else {
            System.out.println("Geçersiz ürün numarası!");
        }
    }

    // Sepeti görüntüleme
    static void sepetiGoster() {
        if (sepetUrunler.isEmpty()) {
            System.out.println("Sepet boş.");
        } else {
            System.out.println("\nSepetiniz:");
            for (int i = 0; i < sepetUrunler.size(); i++) {
                System.out.println((i + 1) + " - " + sepetUrunler.get(i)
                        + " : " + sepetFiyatlar.get(i) + " TL");
            }
        }
    }

    // Sepetten silme
    static void sepettenSil() {
        if (sepetUrunler.isEmpty()) {
            System.out.println("Sepet boş.");
            return;
        }

        sepetiGoster();
        System.out.print("Silmek istediğiniz ürün numarası: ");
        int secim = scanner.nextInt();

        if (secim > 0 && secim <= sepetUrunler.size()) {
            String silinenUrun = sepetUrunler.get(secim - 1);
            int index = urunler.indexOf(silinenUrun);
            stoklar.set(index, stoklar.get(index) + 1);

            sepetUrunler.remove(secim - 1);
            sepetFiyatlar.remove(secim - 1);

            System.out.println("Ürün sepetten silindi.");
        } else {
            System.out.println("Geçersiz ürün numarası!");
        }
    }

    // Toplam tutar (indirimsiz)
    static double toplamTutarHesapla() {
        double toplam = 0;
        for (double fiyat : sepetFiyatlar) {
            toplam += fiyat;
        }
        return toplam;
    }

    static void toplamTutar() {
        System.out.println("Ara Toplam: " + toplamTutarHesapla() + " TL");
    }

    // İndirim uygulama
    static void indirimUygula() {
        System.out.print("İndirim oranını giriniz (%): ");
        indirimOrani = scanner.nextDouble();
        System.out.println("İndirim uygulandı: %" + indirimOrani);
    }

    // Kasa fişi
    static void kasaFisiYazdir() {
        double araToplam = toplamTutarHesapla();
        double indirimTutari = araToplam * indirimOrani / 100;
        double odenecekTutar = araToplam - indirimTutari;

        System.out.println("\n------ KASA FİŞİ ------");
        for (int i = 0; i < sepetUrunler.size(); i++) {
            System.out.println(sepetUrunler.get(i) + " : " + sepetFiyatlar.get(i) + " TL");
        }
        System.out.println("----------------------");
        System.out.println("Ara Toplam : " + araToplam + " TL");
        System.out.println("İndirim (%" + indirimOrani + ") : -" + indirimTutari + " TL");
        System.out.println("Ödenecek Tutar : " + odenecekTutar + " TL");
        System.out.println("----------------------");
        System.out.println("Teşekkür ederiz, yine bekleriz!");
    }
}
