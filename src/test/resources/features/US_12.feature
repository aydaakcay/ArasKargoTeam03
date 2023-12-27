Feature:
  Scenario: US-12 Kullanıcı Müşteri İlişkileri sekmesinden SSS ulaşabilmel
    Given Kullanici siteye gider
    When Cikan mesaj kapatilir
    Then Acilan pencereden Müsteri iliskileri üzerine gelir
    Then DDM den SSS sekmesine tiklar
    Then Gelen Sikca Sorulan Sorular sayfasinda "Kargom ne zaman gelir?" sorusuna tiklar
    Then Cevabın gorunurlugu dogrulanir
    Then Gelen Sıkça Sorulan Sorular sayfasında "Aras Tahsilatlı ile ürün bedeli nasıl tahsil edilir?" sorusuna tıklar,
    Then Doğru yönlendirme ve cevabın olduğunu görür.
    Then Gelen Sıkça Sorulan Sorular sayfasinda "Aras Kargo ile nasıl e-ödeme yaparım?" sorusuna tıklar,
    Then Dogru yonlendirme ve cevabin oldugunu gorur.
