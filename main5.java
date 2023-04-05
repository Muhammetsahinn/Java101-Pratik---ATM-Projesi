import java.util.Scanner;

public class main5 {

    public static void main(String[] args) {

        int PassWord;
        int sayac = 0;
        int bakiye = 1500;
        int a;
        int tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sifrenizi giriniz : ");
          while (sayac<3) {
              PassWord = inp.nextInt();
              if (PassWord == 12345) {
                  while (PassWord == 12345) {
                      System.out.println("Islem Seciniz");
                      System.out.println("1-Para cekme 2-Para yatirma 3-Bakiye Sorgulama 4-Cikis yap");
                      a = inp.nextInt();
                      switch (a) {
                          case 1:
                              System.out.println("Cekilecek tutari yaziniz :");
                              tutar = inp.nextInt();
                              bakiye = bakiye - tutar;
                              System.out.println("Kalan Mevcut Bakiye :" + bakiye);
                              break;
                          case 2:
                              System.out.print("Yatirilacak tutari yaziniz :");
                              tutar = inp.nextInt();
                              bakiye = bakiye + tutar;
                              System.out.println("Islem Basarili Mevcut Bakiye :" + bakiye);
                              break;

                          case 3:
                              System.out.println("Mevcut Bakiye :" + bakiye);
                              break;
                          case 4:
                              System.out.println("Cikis yapildi iyi gunler");
                              break;
                          default:
                              System.out.println("Hatali giris yaptiniz");
                      }
                      if (a == 4) {
                          break;
                      }

                  }
              } else {
                      System.out.print("Sifre yanlis tekrar deneyiniz : ");
                      sayac++;
                      switch (sayac) {
                          case 3:
                              System.out.print("Kartiniz Bloke Olmustur");
                      }

                  }
              }
    }
}