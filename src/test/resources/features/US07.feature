Feature: Kullanici En Yakin Subeler pop-up ini kullanabilmeli.

  Background: url'e git
    Given Kullanici url'e gider


  @ArasBurasiNoktasi

  Scenario: TC01_Kullanici "Aras Burasi Noktalari" butonunu tiklayabilmeli (Pozitif)
    Then Kullanici En Yakin Subeler butonuna tiklar
    Then Kullanici arama islemi dropdown Aras Burasi Noktalari secenegini secer
    Then Kullanici İl veya İlce giriniz bolumune tiklar
    Then Kullanici gecerli il ismi girer.
    Then Kullanici dropdowndan ilce ismi secer
    Then Kullanici ara butonuna basar
    And Kullanici sonuclari liste ve haritada isaretli olarak sunuldugunu dogrular.

  @ArasBurasiNoktasiNegatif

  Scenario: TC02_Kullanici "Aras Burasi Noktalari" butonunu tiklayabilmeli (Negatif)

    Then Kullanici En Yakin Subelerr butonuna tiklar
    Then Kullanici arama islemi dropdown Aras Burasi Noktalarii secenegini secer
    Then Kullanici İl veya İlcee giriniz bolumune tiklar
    Then Kullanici araa butonuna basar
    And Kullanici uyarı mesajı aldıgını dogrular

  @Subelerimiz

  Scenario: TC03_Kullanıcı "Subelerimiz" butonu kullanabilmeli.(Pozitif)

    Then Kullanici En Yakin Subeler butonuna tiklarr
    Then Kullanici arama islemi dropdown Subelerimiz secenegini secer
    Then Kullanici İl veya İlce giriniz bolumune tiklarr
    Then Kullanici gecerli il ismi girerr
    Then Kullanıcı adres detay kısmına bilgi girer
    Then Kullanici ara butonuna basarr
    And Kullanici sonuclari liste ve haritada isaretli olarak sunuldugunu dogrularr.


  @SubelerimizNegatif
  Scenario: TC04_Kullanıcı "Subelerimiz" butonu kullanabilmeli.(Negatif)

    Then Kullanici En Yakin Subelerr butonunaa tiklarr
    Then Kullanici arama islemi dropdown Subelerimiz seceneginii secer
    Then Kullanici İl veya İlce giriniz bolumunee tiklarr
    Then Kullanıcı adres detay kısmına bilgii girer
    Then Kullanici ara butonunaa basarr
    And Kullanici uyarıi mesajı aldıgını dogrular



