package j03_ScannerClass_TypeCasting.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("isim soyisim, yaş, kilo, boy, salona devam edeceğiniz ay süresini giriniz : ");
        String ad = scanner.nextLine();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        int ay = scanner.nextInt();
        System.out.println("adınız = "+ad+"\n"+"yaşınız = "+age+"\n"+"devam edeceğiniz ay = "+ay+"\n"+"ödenmeniz gereken ücret = "+20*ay+"$");
    }
}
