Feature: Kullanici Uye girisi butonunu tiklama testi
  Scenario: TC01 Siteye gidip Uye girisine tiklama
    Given Kullanici aras kargo sitesine gider
    Then Kullanici 2 saniye bekler
    When Kullanici bilgilendirme mesajini kapatir
    Then Kullanici Uye girisi butonuna tiklar
    When Kullanici acilan sekmenin KURUMSAL KULLANICI GİRİŞİ sayfasi oldugunu dogrular
    And Kullanici tum sayfalari kapatir