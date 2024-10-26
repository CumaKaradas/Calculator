# Basit Hesap Makinesi

Bu proje, Java dilinde yazılmış basit bir hesap makinesi uygulamasıdır. Kullanıcıya toplama, çıkarma, çarpma ve bölme işlemlerini yapma imkanı sağlar.

## Özellikler

- **Toplama:** İki sayı arasındaki toplama işlemini gerçekleştirir.
- **Çıkarma:** İki sayı arasındaki çıkarma işlemini gerçekleştirir.
- **Çarpma:** İki sayı arasındaki çarpma işlemini gerçekleştirir.
- **Bölme:** İki sayı arasındaki bölme işlemini gerçekleştirir ve sıfıra bölme hatasını önler.

## Gereksinimler

- **Java 8** veya üstü bir Java versiyonu

## Kurulum

1. Bu projeyi bilgisayarınıza klonlayın veya `HesapMakinesi.java` dosyasını indirin.
2. Java ile derlemek için aşağıdaki komutu kullanın:

    ```bash
    javac HesapMakinesi.java
    ```

3. Uygulamayı çalıştırmak için şu komutu çalıştırın:

    ```bash
    java HesapMakinesi
    ```

## Kullanım

1. Program çalıştırıldığında, kullanıcıdan bir işlem seçmesi istenir:
   - 1: Toplama
   - 2: Çıkarma
   - 3: Çarpma
   - 4: Bölme
2. İşlem seçildikten sonra kullanıcıdan işlem yapmak istediği iki sayı istenir.
3. Sonuç ekranda görüntülenir.

## Kod Hakkında

Bu uygulama dört ana işlem fonksiyonu içerir:
- `toplama()`: Kullanıcıdan iki sayı alır ve toplama işlemini gerçekleştirir.
- `cikarma()`: Kullanıcıdan iki sayı alır ve çıkarma işlemini gerçekleştirir.
- `carpma()`: Kullanıcıdan iki sayı alır ve çarpma işlemini gerçekleştirir.
- `bolme()`: Kullanıcıdan iki sayı alır ve bölme işlemini gerçekleştirir. İkinci sayı sıfır ise "Sıfıra bölme hatası" mesajı verir.

**Not:** Her işlem için ayrı bir `Scanner` nesnesi kullanıldığı için, işlem sonlarında `scanner.close()` ile kapatılmaktadır. Bu sebeple programı geliştirirken bir `Scanner` nesnesi kullanmanız daha verimli olacaktır.

## Katkıda Bulunma

Bu proje geliştirilmeye açıktır. Katkıda bulunmak isterseniz:
1. Projeyi çatallayın.
2. Geliştirmelerinizi yapın.
3. Bir çekme isteği (Pull Request) gönderin.
