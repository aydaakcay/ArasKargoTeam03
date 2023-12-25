Feature: Kullanıcı Sürdürülebilirlik sekmesindeki “Kalite Yönetim Sistemi “ ndeki belgeleri görüntüleme testi
  Scenario: TC01 Sürdürülebilirlik sekmesindeki “Kalite Yönetim Sistemi “ ndeki belgeleri görüntüleyebilmeli
    Given Kullanici aras kargo sitesine gider
    Then Kullanici 2 saniye bekler
    When Kullanici bilgilendirme mesajini kapatir
    Then Kullanici cerezi kapatir