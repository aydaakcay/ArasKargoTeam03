Feature: US06_ArasKargo_Task
  @Araskargo_US_06
  Scenario: TC01_ dashboarddaki  Ücret Hesapla kismindan yurtdışı fiyat listesine ulaşılabilme.
    Given Kullanici araskargo anasayfasina gider
    When  mavi dashboarddaki  ücret  hesapla  butonuna  tıklar
    Then  acılan sayfada  yurt dışı  seçer
    And   Random  bir  ülke  seçer
    And   dosya ve  evrak ikonuna   tıklar
    And   gönderi  detayından  ücretin  görüntülendiği  doğrulanır standart  bedel

  Scenario: TC02_Kullanıcı yurt disi icin Kutu Koli ucretini hesaplayabilmeli
    Given Kullanici araskargo anasayfasina gider
    When  mavi dashboarddaki  ücret  hesapla  butonuna  tıklar
    Then  acılan sayfada  yurt dışı  seçer
    And   Random  bir  ülke  seçer
      And   KUTU  KOLİ  ikonuna  tıklar
      And   "Ağırlık"  "boy"  "yükseklik"  "en"  bilgileri girilir
      And   Desi Kğ  hesapla  butonuna  tıklanır
      And   gönderi  detayından  ücretin  görüntülendiği  doğrulanır

      Scenario: TC03_Kullanıcı yurt disi icin Yeni Hesaplama
      Yap butonu ile ardisik hesaplama yapabilmeli Kutu Koli

        Given Kullanici araskargo anasayfasina gider
        When  mavi dashboarddaki  ücret  hesapla  butonuna  tıklar
        Then  acılan sayfada  yurt dışı  seçer
        And   Random  bir  ülke  seçer
        And   KUTU  KOLİ  ikonuna  tıklar
       # And   ağırlık  boy  yükseklik  en  bilgileri girilir,
        And   Desikğ  hesapla  butonuna  tıklanır.
        And   gönderi  detayından  ücretin  görüntülendiği  doğrulanır
        And   Yeni Hesaplama Yap butonuna tiklar
        And   Ilgili sayfada olduğunu dogrular
        And   random bir ulke secer
        And   KutuKoli secer
        And   AĞIRLIK , YÜKSEKLİK , BOY , EN bilgilerini girer
        And   Desi Kg Hesapla butonuna tiklar
        And   gonderi Detayindan ucret goruntulendigini doğrular

        Scenario: TC04_Kullanıcı yurt disi icin Yeni Hesaplama
        Yap butonu ile ardisik hesaplama yapabilmeli Dosya  Evrak


          Given Kullanici araskargo anasayfasina gider
          When  mavi dashboarddaki  ücret  hesapla  butonuna  tıklar
          Then  acılan sayfada  yurt dışı  seçer
          And   Random  bir  ülke  seçer
       And     Dosya Evrak tiklar ve hizmet turunu secer
       And     Gonderi Detayindan ucret goruntulendigini doğrular.
          And   Yeni Hesaplama Yap butonuna tiklar
       And     ulke bilgisini girer
       And     DosyaEvrak tiklarvehizmet turunu secer
       And     Gonderi Detayindan ucret goruntulendigini doğrular SADECE  HİZMET  BEDELİ KISMI

        Scenario Outline: TC05_Kullanıcı yurt disi icin Kutu  Koli ucretini hesaplayabilmeli - Negative Test

     Given Kullanıcı belirtilen Urle git
     When  Kullanıcı anasayfada Ucret Hesapla butonunu tiklanır
     Then  Acilan sayfada Yurt Disi secilir
     And   random bir ulke secİLİR
     And   Kutu  Koli secilir
     And   "<AĞIRLIK>" AĞIRLIK girilir
          And  "<YÜKSEKLİK>" YÜKSEKLİK GİRİLİR
          And "<BOY>" BOY GİRİLİR
          And "<EN>" EN GİRİLİR
          And   Desi Kg Hesapla butonuna tiklanır
          And     Gonderi Detayindan ucret goruntulendigini doğrular SADECE  HİZMET  BEDELİ KISMI

          Examples:
          |AĞIRLIK|   YÜKSEKLİK|   BOY|  EN|
          |-1     |        -1  |   -2 |  -1|



























































