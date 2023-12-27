Feature:US03_Aras_Kargo

Scenario:Kullanıcı "Acentemiz Olun" sekmesinden Acente olmak için başvuru yapabilmeli (positive scenario)

  Given Kullanici siteye gider
  When Cikan mesaj kapatilir
  Then Acilan pencereden İs Ortagimiz Olunun üzerine gelir
  Then DDM den Acentemiz Olun sekmesine tiklar
  Then Hemen Basvur butonuna tiklar
  Then Acente Basvuru Formu sayfasından il DDM den il secer
  Then Lokasyon Ekleye tiklar
  Then Kullanici gecerli bir isim girer
  Then Kullanici gecerli bir soyisim girer
  Then Kullanici gecerli bir yas girer
  Then Kullanici gecerli bir telefon numarasi girer
  Then Kullanici gecerli bir e posta girer
  Then Egitim durumu DDM den secer
  Then Güvenlik kodu girer
  Then Basvurunu gönder butonuna tiklar
  Then "Başvurunuz ilgili ekiplerimiz ile paylaşılmıştır, teşekkür ederiz." mesajini görür
  And Ana sayfaya dön butonuna tiklar



Scenario:Kullanıcı "Acentemiz Olun" sekmesinden Acente olmak için başvuru yapabilmeli (negative scenario)

  Given Kullanici siteye gider
  When Cikan mesaj kapatilir
  Then Acilan pencereden İs Ortagimiz Olunun üzerine gelir
  Then DDM den Acentemiz Olun sekmesine tiklar
  Then Hemen Basvur butonuna tiklar
  Then Acente Basvuru Formu sayfasından il DDM den il secer
  Then Lokasyon Ekleye tiklar
  Then İsim kutucuguna harf,rakam ve özel karakterlerden oluşan bir isim girer
  Then Soyisim kutucuguna harf,rakam ve özel karakterlerden oluşan bir soyisim girer
  Then Yaş kutucuguna 18' den küçük bir sayı girer
  Then "Minimum 18 karakter olmalıdır" uyarısını aldığını dogrular
  Then Telefon No kutucuguna "0" ile başlamayan bir numara girer
  Then "Telefon numarası '0' ile başlamalıdır" uyarısını aldığını doğrular
  Then Telefon No kutucuguna TR'de geçerli cep telefonu kodları haricinde kodla telefon numarası girer
  Then "Lütfen geçerli bir cep telefon numarası giriniz" uyarısını aldığını doğrular
  Then Telefon No kutucuguna eksik numara ile kayıt yapmayı girer
  Then "Girdiğiniz format hatali" uyarisini  aldıgını dogrular
  Then Mail kutucuguna @ işaretinden sonra herhangi bir karakter ile mail girer
  Then " Bu alanı doldurmak zorunludur" uyarisini aldigini dogrular
  Then Egitim durumu DDM den secmeden girer "Bu alanı doldurmak zorunludur" mesajını alir
  Then Güvenlik Kodu sekmesine, ekranda görünen Güvenlik kodunu girer.
  And "Başvurunuz ilgili ekiplerimiz ile paylaşılmıştır, teşekkür ederiz." mesajini görür




