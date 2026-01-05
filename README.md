🛒 Mini Market Otomasyon Sistemi

Bu proje, BPR 151 – Programcılığa Giriş dersi kapsamında Java programlama dili kullanılarak geliştirilmiş, konsol tabanlı bir Mini Market Otomasyon Sistemi uygulamasıdır. Proje, gerçek hayatta market ve mağazalarda kullanılan otomasyon sistemlerinin temel işleyişini simüle etmeyi amaçlamaktadır.

📌 Projenin Amacı

Günümüzde market ve mağaza otomasyon sistemleri; ürün takibi, stok kontrolü, satış işlemleri, indirim uygulamaları ve raporlama gibi süreçlerin düzenli ve hatasız bir şekilde yürütülmesini sağlamaktadır. Manuel olarak yürütülen bu işlemler zaman kaybına, insan hatalarına ve maddi kayıplara yol açabilmektedir. Bu nedenle otomasyon sistemleri, hem küçük hem de büyük ölçekli işletmeler için vazgeçilmez hale gelmiştir.

Bu proje, Programcılığa Giriş dersi kapsamında verilen bir final projesi olarak geliştirilmiştir. Projenin temel amacı; gerçek hayatta karşılaşılabilecek basit bir market otomasyon problemini ele almak ve bu problemi Java programlama dili kullanarak yazılımsal bir çözüme dönüştürmektir.

Geliştirilen Mini Market Otomasyon Sistemi sayesinde kullanıcılar;

Market bünyesinde bulunan ürünleri ve fiyatlarını görüntüleyebilmekte,

Market sistemine yeni ürün ekleyebilmekte veya mevcut ürünleri silebilmekte,

Ürünleri sepete ekleyip sepetten çıkarabilmekte,

Stok durumu yetersiz olan ürünlerin sepete eklenmesini engelleyebilmekte,

Belirlenen oranlarda indirim uygulayabilmekte,

Alışveriş sonunda detaylı ve anlaşılır bir kasa fişi alabilmektedir.

Bu proje ile öğrencinin; algoritmik düşünme, problem çözme, program akışını planlama ve Java’nın temel yapılarını etkin kullanma becerilerini geliştirmesi hedeflenmiştir.

⚙️ Uygulama Özellikleri

📦 Ürün listeleme

➕ Yeni ürün ekleme

❌ Ürün silme

📊 Stok takip sistemi

🧺 Sepete ürün ekleme ve sepetten çıkarma

⛔ Stokta olmayan ürünlerin sepete eklenmesinin engellenmesi

💸 Yüzde bazlı indirim uygulama

🧾 Detaylı kasa fişi oluşturma

🧭 Menü tabanlı kullanıcı etkileşimi

🧠 Kullanılan Teknolojiler

Programlama Dili: Java

Uygulama Türü: Konsol Tabanlı Uygulama

IDE: IntelliJ IDEA Community Edition

🧩 Kullanılan Java Yapıları ve Veri Yapıları

Bu projede, Programcılığa Giriş dersi kapsamında öğrenilen temel Java konuları aktif olarak kullanılmıştır:

Değişkenler

Koşul yapıları (if-else, switch-case)

Döngüler (for, while)

Metotlar

ArrayList veri yapısı

Kullanım Amaçları

ArrayList: Ürün isimleri, fiyatları, stok bilgileri ve sepet ürünlerinin dinamik olarak tutulması

Metotlar: Kodun daha okunabilir ve modüler hale getirilmesi

🏗️ Program Tasarımı ve Çalışma Mantığı

Uygulama tamamen konsol tabanlı olarak tasarlanmıştır. Kullanıcı ile etkileşim, ekrana yazdırılan metin tabanlı menüler aracılığıyla sağlanmaktadır. Bu yaklaşım, programlamaya yeni başlayan öğrencilerin algoritma ve program akış mantığını daha net kavrayabilmesi açısından tercih edilmiştir.

Programın ana kontrol yapısı while döngüsü ile sağlanmaktadır. Kullanıcı çıkış seçeneğini seçene kadar program çalışmaya devam etmektedir. Her kullanıcı seçimi, switch-case yapısı kullanılarak ilgili işlem bloğuna yönlendirilir.

Genel Program Akışı

Program başlatılır ve ana menü ekrana yazdırılır

Kullanıcıdan bir işlem seçmesi istenir

Seçilen işleme göre ilgili metot çalıştırılır

Stok ve sepet verileri güncellenir

Kullanıcı tekrar ana menüye yönlendirilir

Çıkış seçildiğinde program güvenli bir şekilde sonlandırılır

Bu yapı sayesinde program modüler, okunabilir ve genişletilebilir bir hale getirilmiştir.

📊 Stok Yönetim Sistemi

Stok yönetimi, Mini Market Otomasyon Sisteminin en kritik bileşenlerinden biridir. Gerçek hayattaki market sistemlerinde olduğu gibi, stok bilgileri her işlem sonrası güncel tutulmaktadır.

Sepete ürün ekleme işlemi sırasında ilgili ürünün stok miktarı kontrol edilir.

Stok miktarı sıfır olan ürünlerin sepete eklenmesine izin verilmez.

Sepetten ürün çıkarıldığında, çıkarılan ürünün stok miktarı otomatik olarak artırılır.

Bu mekanizma sayesinde stok bilgileri her zaman doğru ve güncel kalmakta, kullanıcıya hatalı bilgi sunulmasının önüne geçilmektedir. Ayrıca bu yapı, market işletmeciliği açısından olası zararların önlenmesini sağlamaktadır.

💸 İndirim Sistemi

Uygulamada esnek bir indirim sistemi bulunmaktadır. Kullanıcı, alışveriş sırasında sepet ara toplamı üzerinden uygulanacak indirim oranını yüzde (%) cinsinden belirleyebilmektedir.

İndirim hesaplama süreci şu şekilde gerçekleşmektedir:

Sepetteki ürünlerin toplam tutarı hesaplanır

Kullanıcının belirlediği indirim oranı alınır

İndirim tutarı hesaplanır

İndirim tutarı toplam fiyattan düşülerek ödenecek tutar belirlenir

Bu sistem, kampanya ve promosyon uygulamalarının temel mantığını simüle etmekte ve kullanıcıya gerçekçi bir alışveriş deneyimi sunmaktadır.

🧾 Kasa Fişi Oluşturma

Alışverişin sonunda kullanıcıya detaylı bir kasa fişi sunulmaktadır. Kasa fişi aşağıdaki bilgileri içermektedir:

Sepette bulunan ürünler

Ürün fiyatları

Ara toplam

Uygulanan indirim oranı

İndirim tutarı

Ödenecek toplam tutar

Kasa fişi, konsol ekranına düzenli ve okunabilir bir formatta yazdırılmaktadır.

📂 Proje Klasör Yapısı
BPR_151_FINAL_OGRENCINUMARASI/
├── src/
│ └── Main.java
├── .idea/
├── out/
Main.java: Uygulamanın ana sınıfını içerir. Tüm market otomasyonu işlemleri bu dosya üzerinden yürütülmektedir.
Kod içerisinde açıklayıcı yorum satırları kullanılmıştır.
