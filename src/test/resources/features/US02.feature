@us02
Feature: AmbalajUrunleri

  Background:
    Given Kullanıcı "https://www.araskargo.com.tr/" e gider.

  @AmbalajUrunleri
  Scenario:
    When Kullanıcı Hizmetlerimiz butonu üzerine gelir
    When Kullanıcı acılan sekmede Ambalaj ürünlerimiz butonuna tıklar
    When Kullanıcı ambalaj fiyatları pdf butonuna tıklar
    Then Kullanıcı ambalaj fiyatları listesini goruntuler

  @linkedin
  Scenario:
    When Kullanıcı Kariyer sekmesine tıklar.
    When Kullanıcı Gelecegin Bizde Önem Tasır butonunu tıklar
    When Kullanıcı Aras Kargo İş Basvuruları yazan alana gelir
    When Kullanıcı Linkedin butonuna tıklar
    Then Kullanıcı Linkedinde Aras Kargo sayfasını göruntuler
  @kariyer
  Scenario:
    When Kullanıcı Kariyer sekmesine tıklar.
    When Kullanıcı Gelecegin Bizde Önem Tasır butonunu tıklar
    When Kullanıcı Aras Kargo İş Basvuruları yazan alana gelir
    When Kullanıcı Kariyer.net butonuna tıklar
    Then Kullanıcı Kariyer.net sayfasını göruntuler
  @secret
  Scenario:
    When Kullanıcı Kariyer sekmesine tıklar.
    When Kullanıcı Gelecegin Bizde Önem Tasır butonunu tıklar
    When Kullanıcı Aras Kargo İş Basvuruları yazan alana gelir
    When Kullanıcı Secretcv butonuna tıklar
    Then Kullanıcı Secretcv sayfasını göruntuler
  @eleman
  Scenario:
    When Kullanıcı Kariyer sekmesine tıklar.
    When Kullanıcı Gelecegin Bizde Önem Tasır butonunu tıklar
    When Kullanıcı Aras Kargo İş Basvuruları yazan alana gelir
    When Kullanıcı elemannet butonuna tıklar
    Then  Kullanıcı elemannet sayfasını goruntuler