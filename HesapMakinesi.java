import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İşlem seçiniz: ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                toplama();
                break;
            case 2:
                cikarma();
                break;
            case 3:
                carpma();
                break;
            case 4:
                bolme();
                break;
            default:
                System.out.println("Geçersiz işlem!");
                break;
        }

        scanner.close();
    }

    // Toplama işlemi
    public static void toplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplamak istediğiniz sayıları giriniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sonuc = sayi1 + sayi2;
        System.out.println("Sonuç: " + sonuc);
        scanner.close();
    }

    // Çıkarma işlemi
    public static void cikarma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çıkarmak istediğiniz sayıları giriniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sonuc = sayi1 - sayi2;
        System.out.println("Sonuç: " + sonuc);
        scanner.close();
    }

    // Çarpma işlemi
    public static void carpma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çarpmak istediğiniz sayıları giriniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sonuc = sayi1 * sayi2;
        System.out.println("Sonuç: " + sonuc);
        scanner.close();
    }

    // Bölme işlemi
    public static void bolme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bölmek istediğiniz sayıları giriniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        if (sayi2 != 0) {
            double sonuc = sayi1 / sayi2;
            System.out.println("Sonuç: " + sonuc);
        } else {
            System.out.println("Hata! Sıfıra bölme hatası.");
        }
        scanner.close();
    }
}
