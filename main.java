import java.util.Scanner;

class Banka {
    private double bakiye;

    public Banka(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
    }

    public void paraCek(double miktar) {
        if (bakiye >= miktar) {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Yeni bakiye: " + bakiye + " TL");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public void bakiyeSorgula() {
        System.out.println("Şu anki bakiyeniz: " + bakiye + " TL");
    }
}

public class BankaSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banka hesap = new Banka(0);

        while (true) {
            System.out.println("\nBankamatik İşlemleri:");
            System.out.println("1. Para Yatır");
            System.out.println("2. Para Çek");
            System.out.println("3. Bakiye Sorgula");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    double yatirilanMiktar = scanner.nextDouble();
                    hesap.paraYatir(yatirilanMiktar);
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    double cekilenMiktar = scanner.nextDouble();
                    hesap.paraCek(cekilenMiktar);
                    break;
                case 3:
                    hesap.bakiyeSorgula();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
