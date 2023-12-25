Feature: US05_ArasKargo_Task
  @Araskargo_US_05
  Scenario: TC01_ Mavi dashboarddaki Ücret Hesapla kismindan yurt içi fiyat listesine ulaşılabilmeli.

   Given Kullanici olarak gecerli url'ye git
   When  ekrandaki bilgilendirme yazisini kapat
   Then  Mavi dashboarddaki Ücret Hesapla butonuna tikla
   And   Ucret hesapla sekmesine gidildigi dogrulanir.
   And   Nereden ve nereye kısımları doldurulur
   And   Kullanici gonderen ve alici adreslerini doldurur
   And   Kullanici sorumlu subeyi bul butonuna tiklar ve bir sube secer.
   And   Kullanici kutu/koli secenegini secer.
   And   Kullanici gonderilicek paketin boyutlarini girer.
   And   Kullanici Desi Kg Hesapla butonuna tiklar.
   And   Kullanici herhangi bir ambalaj secerek ambalajin fiyati etkiledigini dogrular
   And   Kullanici bir gonderi seklini secer ve fiyata etki ettigini dogrular.
   And   Kullanici teslimat seceneklerinden birini veya  hepsini secer ve  fiyatın  değiştiği doğrulanır
   And   Kullanici ek hizletlerden birini birden fazla veya hicbirini secmeden isleme devam eder
   And   Kullanici toplam fiyati gorur.

    Scenario: TC02_Sayfayi assagiya kaydirarak gelen dashboarddaki
    Ücret Hesapla kismindan yurt içi fiyat listesine ulaşılabilmeli.

    Given Kullanici gecerli url'ye gider
    When  Kullanici ekrandaki bilgilendirme yazisini kapatir
    Then  Kullanici ikincil dashboarda ulasabilmek icin sayfayi gerekli yere  kadar  indirir
    And   Kullanici dashboarddaki ucreti hesapla yazisina tiklar.
    And   kullanici cikan pop up dan gonderici ve alici adreslerini girer.
    And   Kullanici gonderilen ve gidecek sehirlerin yazili oldugunu dogrular.
    And   Kullanici gonderen ve alici adreslerini doldurur
    And   Kullanici sorumlu subeyi bul butonuna tiklar ve bir sube secer.
    And   Kullanici kutu/koli secenegini secer.
    And   Kullanici gonderilicek paketin boyutlarini girer.
    And   Kullanici Desi / Kg Hesapla butonuna tiklar.
    And   Kullanici herhangi bir ambalaj secerek ambalajin fiyati etkiledigini dogrular
    And   Kullanici bir gonderi seklini secer ve fiyata etki ettigini dogrular.
    And   Kullanici teslimat seceneklerinden birini veye hepsini secer
    And   Kullanici ek hizletlerden birini birden fazla veya hicbirini secmeden isleme devam eder
    And   Kullanici toplam fiyati gorur.

      Scenario: TC03_Sayfayi assagiya kaydirarak gelen dashboarddaki
      Ücret Hesapla kismindan yurt içi fiyat listesine ulaşılabilmeli.

     Given Kullanici gecerli url'ye gider
      When Kullanici ekrandaki bilgilendirme yazisini kapatir
      Then Kullanici ikincil dashboarda ulasabilmek icin sayfayi gerekli yere  kadar  indirir
      And Kullanici dashboarddaki ucreti hesapla yazisina tiklar.
      And kullanici cikan pop up dan gonderici ve alici adreslerini girer.
      And Kullanici gonderilen ve gidecek sehirlerin yazili oldugunu dogrular.
      And Kullanici gonderen ve alici adreslerini doldurur
      And Kullanici sorumlu subeyi bul butonuna tiklar ve bir sube secer.
      And Kullanici dosya/evrak secenegini secer.
      And Kullanici herhangi bir ambalaj secerek ambalajin fiyati etkiledigini dogrular
      And Kullanici bir gonderi seklini secer ve fiyata etki ettigini dogrular.
      And Kullanici teslimat seceneklerinden birini veye hepsini secer
      And Kullanici ek hizletlerden birini birden fazla veya hicbirini secmeden isleme devam eder
      And Kullanici toplam fiyati gorur.









































