Feature: US01Kullanıcı dashboarddaki elementleri tıklayabilmeli ve drop downları kullanabilmeli.

  Scenario:TC01 Kullanıcı Hakkımızda sayfasına erişebilmelidir
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    When Kullanıcı ana sayfaya erişir
    And Kullanıcı Hakkımızda butonuna tıklar
    Then Kullanıcı "Hakkımızda" sayfasına erişebilmelidir


    Scenario:TC02 Kullanıcı Hizmetlerimiz sayfasına erişebilmelidir
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    Then Kullanıcı Ana sayfaya erişır.
    Then Kullanıcı Hizmetlerimiz butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Hizmetlerimiz" sayfasına erişebilmelidir.


  Scenario:TC03 Kullanıcı Kariyer sayfasına erişebilmelidir.
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Kullanıcı Kariyer butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Kariyer" sayfasına erişebilmelidir.


  Scenario:TC04 Kullanıcı Sürdürülebilirlik sayfasına erişebilmelidir.
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Kullanıcı Sürdürülebilirlik  butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Sürdürülebilirlik " sayfasına erişebilmelidir.


  Scenario:TC05 Kullanıcı Iş Ortağımız Olun sayfasına erişebilmelidir.
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Kullanıcı Iş Ortağımız Olun  butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Kullanıcı Iş Ortağımız Olun" sayfasına erişebilmelidir.


  Scenario:TC06 Kullanıcı Müşteri İlişkileri sayfasına erişebilmelidir.
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Kullanıcı Müşteri İlişkileri  butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Müşteri İlişkileri" sayfasına erişebilmelidir.


  Scenario:TC07 Aras Kargo Spor Kulubü sayfasına erişebilmelidir.
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Aras Kargo Spor Kulubü  butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Aras Kargo Spor Kulubü" sayfasına erişebilmelidir.


  Scenario:TC08 Bize Ulaşın butonuna erişebilmelidir.
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Bize Ulaşın butonuna  butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Bize Ulaşın butonuna" sayfasına erişebilmelidir.


  Scenario:TC09  Vizyon,Misyon ve Politikalar butonunu tıklanabilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then  Vizyon,Misyon ve Politikalar butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da " Vizyon,Misyon ve Politikalar" sayfasına erişebilmelidir.


  Scenario:TC10 Yönetim Ekibimiz butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then  Yönetim Ekibimiz butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da " Yönetim Ekibimiz" sayfasına erişebilmelidir.


  Scenario:TC11 Haberler ve Duyurular butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Haberler ve Duyurular  butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Haberler ve Duyurular" sayfasına erişebilmelidir.


  Scenario:TC12 Reklamlarımız  butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Reklamlarımız butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Reklamlarımız" sayfasına erişebilmelidir.


  Scenario:TC13 Bireysel Hizmetlerimiz butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Bireysel Hizmetlerimiz butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Bireysel Hizmetlerimiz" sayfasına erişebilmelidir.


  Scenario:TC14 Kurumsal Hizmetlerimiz butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Kurumsal Hizmetlerimiz butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Kurumsal Hizmetlerimiz" sayfasına erişebilmelidir.


  Scenario:TC15 Ambalaj Hizmetlerimiz butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Ambalaj Hizmetlerimiz butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Ambalaj Hizmetlerimiz" sayfasına erişebilmelidir.


  Scenario:TC16 Araslar Bizde Önem Taşır butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Araslar Bizde Önem Taşır butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Araslar Bizde Önem Taşır" sayfasına erişebilmelidir.


  Scenario:TC17 Geleceğin Bizde Önem Taşır butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Geleceğin Bizde Önem Taşır butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Geleceğin Bizde Önem Taşır" sayfasına erişebilmelidir.


  Scenario:TC18 İyi Bir Dünya Bizde Önem Taşır butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then İyi Bir Dünya Bizde Önem Taşır butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "İyi Bir Dünya Bizde Önem Taşır" sayfasına erişebilmelidir.


  Scenario:TC19 Teknoloji Bizde Önem Taşır butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Teknoloji Bizde Önem Taşır butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Teknoloji Bizde Önem Taşır" sayfasına erişebilmelidir.


  Scenario:TC20 Sürdürülebilirlik Rotası butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Sürdürülebilirlik Rotası butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Sürdürülebilirlik Rotası" sayfasına erişebilmelidir.


  Scenario:TC21 Sosyal Sorumluluk Platformlarımız butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Sosyal Sorumluluk Platformlarımız butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Sosyal Sorumluluk Platformlarımız" sayfasına erişebilmelidir.


  Scenario:TC22 Kalite Yönetim Sistemi butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Kalite Yönetim Sistemi butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Kalite Yönetim Sistemi" sayfasına erişebilmelidir.


  Scenario:TC23 Acentemiz Olun butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Acentemiz Olun butonunu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Acentemiz Olun" sayfasına erişebilmelidir.


  Scenario:TC24 Aras Burası Noktası Olsun butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Aras Burası Noktası Olsun tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Aras Burası Noktası Olsun" sayfasına erişebilmelidir.


  Scenario:TC25 Esnaf Kurye Olun butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Esnaf Kurye Olun tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Esnaf Kurye Olun" sayfasına erişebilmelidir.


  Scenario:TC26 Aracınızı Kiralayın butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Aracınızı Kiralayın tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Aracınızı Kiralayın" sayfasına erişebilmelidir.


  Scenario:TC27 Sık Sorulan Sorular butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Sık Sorulan Sorular tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Sık Sorulan Sorular" sayfasına erişebilmelidir.


  Scenario:TC28 Aras'a Sor butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Aras'a Sor tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Aras'a Sor" sayfasına erişebilmelidir.


  Scenario:TC29 Çağrı Merkezi butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Çağrı Merkezi tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Çağrı Merkezi" sayfasına erişebilmelidir.


  Scenario:TC30 Hasar Tazmin butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Hasar Tazmin tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Hasar Tazmin" sayfasına erişebilmelidir.


  Scenario:TC31 Geri Bildirim Formu butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Geri Bildirim Formu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Geri Bildirim Formu" sayfasına erişebilmelidir.


  Scenario:TC32 SSS  butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then SSS  tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "SSS" sayfasına erişebilmelidir.


  Scenario:TC33 Aras Kargo Spor Kulübu butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Aras Kargo Spor Kulübu tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Aras Kargo Spor Kulübu" sayfasına erişebilmelidir.


  Scenario:TC34 İletişim  butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then İletişim  tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "İletişim " sayfasına erişebilmelidir.


  Scenario:TC35 Genel Müdürlük  butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Genel Müdürlük  tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Genel Müdürlük " sayfasına erişebilmelidir.


  Scenario:TC36 Bölge Müdürlüklerimiz butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Bölge Müdürlüklerimiz tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Bölge Müdürlüklerimiz" sayfasına erişebilmelidir.


  Scenario:TC37 Şubelerimiz  butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Şubelerimiz  tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Şubelerimiz " sayfasına erişebilmelidir.


  Scenario:TC38 Aras Burası Noktalarımız butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Aras Burası Noktalarımız tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Aras Burası Noktalarımız" sayfasına erişebilmelidir.


  Scenario:TC39 Müşterimiz Olun butonunu tıklanıbilmeli
    Given Kullanıcı "https://www.araskargo.com.tr/" adresine gider
    And Kullanıcı Ana sayfaya erişır.
    Then Müşterimiz Olun tıklanabilmeli butonuna tıklar.
    And Kullanıcı, oturum açmış veya kayıtlı olmasa da "Müşterimiz Olun" sayfasına erişebilmelidir.


