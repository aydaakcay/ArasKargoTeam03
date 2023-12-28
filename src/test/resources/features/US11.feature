@Mehmet
Feature: US11 Test Caseleri



  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" e gider.
    When Kullanici is ortagimiz olun sekmesinin üzerine mause u bekletir
    And Acilan sekmeden sikca sorulan sorular butonuna tiklar
    Then Kimler aras kargo acentesi olmak icin aday olabilir butonun gorunur oldugunu dogrular
    And Acente olmak icin aday sorusunun cevabinin gorundugu dogrulanir


    Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
      Given Aras Kargoda Acente olmak icin nasıl basvurulur textinin gorunur oldugunu dogrulanir
      Then Acenta olmak icin nasıl basvurulur sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Aras Kargo Acentesi olmak icin talep edilen isim hakki bedeli ne kadardir textinin gorunur oldugunu dogrulanir
    Then Talep edilen isim hakki bedeli sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Aras Kargo Acentesi olmak için talep edilen teminat bedeli ne kadardir textinin gorunur oldugunu dogrulanir
    Then Talep edilen teminat bedeli sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Aras Kargo Acentesi olmak icin teminat olarak ne verebilirim textinin gorunur oldugunu dogrulanir
    Then Teminat olarak ne verebilirim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Aras Kargo subesi olmayan bir yerde ilce veya lokasyon acente acabilirmiyim textinin gorunur oldugunu dogrulanir
    Then Acente acabilirmiyim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Kargo acenteligi yapabilmek için alinmasi zorunlu olan yetki belgesi var mı textinin gorunur oldugunu dogrulanir
    Then Yetki belgesi varmi sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Tuzel kisi uzerine Aras Kargo acentesi alinabilir mi Alinabilirse kosullari ne olur textinin gorunur oldugunu dogrulanir
    Then Kosullar sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Adi ortaklikla Aras Kargo acentesi alinabilir mi textinin gorunur oldugunu dogrulanir
    Then Adi Ortaklikla Aras Kargo Acentesi alinabilirmi sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Web sitesinden Aras Kargo Acente basvurusu yaptim ne zaman aranirim textinin gorunur oldugunu dogrulanir
    Then Ne zaman aranirim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanici İs Ortagimiz olun sekmesindeki SSS sayfasindaki Acentemiz olun sayfasindaki soru ve cevaplari gorebilmeli
    Given Başvuru sürecinde birebir görüsme asamasinda hangi evraklar istenir textinin gorunur oldugunu dogrulanir
    Then Hangi evraklar istenir sorusunun cevabinin gorundugu dogrulanir


    Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
      Given Kullanici Aras Burasi Noktasi Olun Butonuna tiklar
      When  Aras Burasi noktasi oldugunda elde edilecek gelir ne olacak textinin gorunur oldugu dogrulanir
      Then Elde edilecek gelir ne olacak sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Burasi noktasina gelen kargo tipi nasildir textinin gorunur oldugu dogrulanir
    Then Kargo tipi sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Burasi noktasi olarak teslimat nasil yapilacak textinin gorunur oldugu dogrulanir
    Then Teslimat nasil yapilacak sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Birden fazla firmanin teslimat noktasi olabilirmiyim textinin gorunur oldugu dogrulanir
    Then Birden fazla firmanin teslimat noktasi olabilirmyim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Burasi noktasi olarak musterilerden iade kargolar nasıl alinacak textinin gorunur oldugu dogrulanir
    Then Iade kargolar nasil alinacak sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Burasi basvuru surecinde dikkat edilmesi gereken hususlar textinin gorunur oldugu dogrulanir
    Then Dikkat edilmesi gereken hususlar sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Burasi sureci basladiginda iletisim kurulacak kisilere nasil ulasabilirim textinin gorunur oldugu dogrulanir
    Then Iletisim kurulacak kisilere nasil ulasabilirim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Burasi uygulamasina iliskin onerileri nasil paylasabilirim textinin gorunur oldugu dogrulanir
    Then Onerileri nasil paylasabilirim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Burasi uygulamasina iliskin egitim sureci nasil isleyecek textinin gorunur oldugu dogrulanir
    Then Egitim sureci nasil isleyecek sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Burasi hakedis sureci nasil calisacak textinin gorunur oldugu dogrulanir
    Then Hakedis sureci nasil calisacak sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız olun sekmesindeki SSS sayfasındaki Aras Burasi Noktasi Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Esnaf Temsilcimizin yapisal degişikliklerde ne yapmasi gerekiyor textinin gorunur oldugu dogrulanir
    Then Esnaf temsilcimizin yapisal degisiklerde ne yapmasi gerekiyor sorusunun cevabinin gorundugu dogrulanir

    Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Esnaf Kurye Olun sayfasındaki soru ve cevapları görebilmeli.
      Given Kullanici Esnaf Kurye Olun butonuna tiklar
      Then  Nasıl Aras Kargo Esnaf Kurye olabilirim textinin gorunur oldugu dogrulanir
      And Nasıl Aras Kargo Esnaf Kurye olabilirim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Esnaf Kurye Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Kimler Aras Kargo Esnaf Kurye olabilir textinin gorunur oldugu dogrulanir
    Then Kimler Aras Kargo Esnaf Kurye olabilir sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Esnaf Kurye Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Kargo Esnaf Kurye olmak icin nasil bir araca sahip olmaliyim textinin gorunur oldugu dogrulanir
    Then Nasil bir araca sahip olmaliyim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Esnaf Kurye Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Kargo Esnaf Kurye aylik ne kadar kazanir textinin gorunur oldugu dogrulanir
    Then Aras Kargo Esnaf Kurye aylik ne kadar kazanir sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Esnaf Kurye Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Teslimatini sagladigim kargo basina ne kadar kazaniyorum textinin gorunur oldugu dogrulanir
    Then Nekadar kazaniyorum sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Esnaf Kurye Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Kargo Esnaf Kurye olarak teslimatlari nasil sagliyorum textinin gorunur oldugu dogrulanir
    Then Teslimatlari nasil sagliyorum sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Esnaf Kurye Olun sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Kargo Esnaf Kurye calisma saatleri nedir textinin gorunur oldugu dogrulanir
    Then Calisma saatleri sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Aracınızı Kiralayın sayfasındaki soru ve cevapları görebilmeli.
    Given Kullanici Aracinizi Kiralayin butonuna tiklar
    Then  Aras Kargoya arac nasil kiralanir textinin gorunur oldugu dogrulanir
    And Arac nasil kiralanir sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Aracınızı Kiralayın sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Kargoya arac kiralamak icin nasil bir araca sahip olmaliyim textinin gorunur oldugu dogrulanir
    Then Aras kargoya Arac kiralamak icin Nasil bir araca sahip olmaliyim sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Aracınızı Kiralayın sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Kargoya kiralanan arac masraflari kim tarafindan karsilaniyor textinin gorunur oldugu dogrulanir
    Then Arac masraflari kim tarafindan karsilaniyor sorusunun cevabinin gorundugu dogrulanir

  Scenario: Kullanıcı İs Ortağımız Olun sekmesindeki Sık Sorulan Sorular sayfasındaki Aracınızı Kiralayın sayfasındaki soru ve cevapları görebilmeli.
    Given  Aras Kargoya kiralik arac ile calisma saatleri nelerdir textinin gorunur oldugu dogrulanir
    Then Arac ile calisma saatleri nelerdir sorusunun cevabinin gorundugu dogrulanir



























