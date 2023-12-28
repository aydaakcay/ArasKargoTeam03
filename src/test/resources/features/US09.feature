@us09
Feature:SizeNasılYardımcıOlabilirim

  Background:
    Given Kullanıcı "https://www.araskargo.com.tr/" e gider.
  Scenario:
  When Kullanıcı Anasayfada Size Nasıl Yardimci olabilirim popUpa tiklar.
  When Kullanıcı "https://www.araskargo.com.tr/chat-bot-content" adresine gider.
  When Kullanıcı açilan pencereden Devam butonuna tiklar
  When Kullanıcı girmesi gereken ad soyad bilgilerini girer ve gonder butonuna tiklar
  When Kullanıcı girmesi gereken telefon numarası girer ve gonder butonuna tıklar.
  When Kullanıcı girmesi gereken mail adresi bilgisini girer ve gönder butonuna tiklar
  When Kullanici girmesi gereken islem numarasi girer
  Then Kullanıcı Ilgili soruya yönlendirildigini dogrular.
  Then Kullanıcı sayfayı kapatır.


    Scenario: cıkısYap
      When Kullanıcı Anasayfada Size Nasıl Yardimci olabilirim popUpa tiklar.
      When Kullanıcı "https://www.araskargo.com.tr/chat-bot-content" adresine gider.
      When Kullanıcı açilan pencereden Devam butonuna tiklar
      When Kullanıcı girmesi gereken ad soyad bilgilerini girer ve gonder butonuna tiklar
      When Kullanıcı girmesi gereken telefon numarası girer ve gonder butonuna tıklar.
      When Kullanıcı girmesi gereken mail adresi bilgisini girer ve gönder butonuna tiklar
      When Kullanici girmesi gereken islem numarasi girer
      Then Kullanıcı cıkıs yapar ve ilgili uyarı mesajını dogrular
      Then Kullanıcı sayfayı kapatır.

