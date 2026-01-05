🛒 Mini Market Otomasyonu
Bu proje, temel Java programlama prensipleri kullanılarak geliştirilmiş, konsol tabanlı bir market yönetim sistemidir. Ürün stok takibi, sepet yönetimi ve indirimli kasa fişi oluşturma gibi işlevsel özelliklere sahiptir.

👤 Geliştirici Bilgileri
Ad Soyad: Yunusemre Perdi

Öğrenci Numarası: 240053034

Bölüm: Bilgisayar Programcılığı

🚀 Özellikler
Proje, bir marketin günlük operasyonel ihtiyaçlarını karşılamak üzere şu fonksiyonları sunar:

Envanter Yönetimi: Ürün ekleme, silme ve detaylı stok takibi.

Stok Kontrol Sistemi: Ürün sepete eklendiğinde stoktan düşme, sepetten çıkarıldığında stoğa geri ekleme.

Sepet Yönetimi: Dinamik ürün ekleme ve sepetten ürün çıkarma.

İndirim Mekanizması: Toplam tutar üzerinden yüzde bazlı indirim uygulama.

Kasa Fişi: Tüm kalemlerin, ara toplamın, indirim miktarının ve net ödenecek tutarın detaylı dökümü.

🛠 Kullanılan Teknolojiler
Dil: Java (JDK 8 veya üzeri)

Veri Yapıları: ArrayList (Dinamik veri yönetimi için)

Giriş/Çıkış: java.util.Scanner

📖 Kullanım ve Menü Yapısı
Program çalıştırıldığında kullanıcıyı karşılayan ana menü seçenekleri şunlardır:

Market Ürünlerini Listele: Mevcut ürünlerin adını, fiyatını ve stok durumunu gösterir.

Market Ürün Ekle/Sil: Envantere yeni ürün tanımlar veya mevcut olanı kaldırır.

Sepete Ürün Ekle: Ürün numarası ile seçim yapılır (Stok kontrolü yapılır).

İndirim Uygula: Müşteriye özel yüzde (%) cinsinden indirim tanımlar.

Kasa Fişi Yazdır: İşlemi tamamlar ve mali dökümü ekrana basar.
📜 Kod Yapısı Hakkında Notlar
Proje içerisinde veriler üç ana ArrayList üzerinde senkronize bir şekilde tutulmaktadır:

urunler: Ürün isimlerini saklar.

fiyatlar: Ürünlerin birim fiyatlarını double tipinde saklar.

stoklar: Ürünlerin anlık stok adetlerini Integer tipinde yönetir.
