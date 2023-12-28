@Team03
Feature: US08 Test Caseleri


  Scenario: Kullanıcı Müşteri İlişkileri Sekmesinden Geri bildirim formuna girip Bireysel sekmesindeki menüleri kullanabilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" e gider.
    When Kullanici musteri iliskileri sekmesinin üzerine mause u bekletir
    And Acilan sekmeden Geri Bildirim Formuna tiklar
    Given Kategori secin menusune tiklar
    And Kullanici Bilgi ddm menusune tiklar
    Then Kullanici Bilgi ddm menusunun tiklanabilir oldugunu dogrular


  Scenario: Kullanıcı Müşteri İlişkileri Sekmesinden Geri bildirim formuna girip Bireysel sekmesindeki menüleri kullanabilmeli
    Given  Kullanici İşlem-Talep ddm menusune tiklar
    Then Kullanici İşlem-Talep ddm menusune tiklanabilir oldugunu dogrular


  Scenario: Kullanıcı Müşteri İlişkileri Sekmesinden Geri bildirim formuna girip Bireysel sekmesindeki menüleri kullanabilmeli
    Given  Kullanici Oneri ddm menusune tiklar
    Then Kullanici Oneri ddm menusune tiklanabilir oldugunu dogrular


  Scenario: Kullanıcı Müşteri İlişkileri Sekmesinden Geri bildirim formuna girip Bireysel sekmesindeki menüleri kullanabilmeli
    Given  Kullanici Sikayet  ddm menusune tiklar
    Then Kullanici Sikayet  ddm menusune tiklanabilir oldugunu dogrular


  Scenario: Kullanıcı Müşteri İlişkileri Sekmesinden Geri bildirim formuna girip Bireysel sekmesindeki menüleri kullanabilmeli
    Given  Kullanici Teşekkürler  ddm menusune tiklar
    Then Kullanici Teşekkürler  ddm menusune tiklanabilir oldugunu dogrular

    Scenario: Kullanıcı Müşteri İlişkileri Sekmesinden Geri bildirim formuna girip Bireysel sekmesindeki menüleri kullanabilmeli ve formu doldurabilmeli
    Given Kategori secin menusune tiklar
    When Kullanici Bilgi ddm menusune tiklar
    And Kullanici Bilgi ddm menusunun tiklanabilir oldugunu dogrular
    And Kullanici konu basligi secin bolumunden e odeme bilgisi bolumunu secer
      And Ad bolumune tikla ve ardindan soyad bolumune tikla
      Then Ad bolumu bos birakildigi icin hata verdigini dogrula
      And Random bir isim gir
      And Soyad bolumunde hata ciktigini dogrula ve random bir isim gir
      And Cep telefonu bolumune tikla ardinda e postaya tikla
      And Cep telefonu bos birakildigi icin hata verdigini dogrula ve random bir numara gir
      And Eposta adresinin hata verdigini dogrula ve random bir email gir
      And Il ilce seciniz kismina adanayi gir ve ilgili subeyi secin kismindan ceyhani sec
      And Mesajiniz bolumune "Merhaba" gir
      And Dosya Ekle bolumune bir resim yukle




