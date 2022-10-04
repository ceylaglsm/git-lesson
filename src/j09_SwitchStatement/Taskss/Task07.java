package j09_SwitchStatement.Taskss;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..


        Scanner scan = new Scanner(System.in);
        System.out.print(" 3 basamaklı sayi giriniz :");
        int sayi = scan.nextInt();
        int yüzler = sayi / 100;
        int onlar = (sayi / 10) % 10;
        int birler = sayi % 10;
        if (sayi >= 100 && sayi <= 999)
            switch (yüzler) {
                case 1:
                    System.out.println("yüz");
                case 2:
                    System.out.println("iki yüz");
                case 3:
                    System.out.println("  üçyüz");
                case 4:
                    System.out.println(" dört yüz");
                case 5:
                    System.out.println(" beş yüz");
                case 6:
                    System.out.println("altı yüz");
                case 7:
                    System.out.println(" yedi yüz");
                case 8:
                    System.out.println("sekiz yüz");
                case 9:
                    System.out.println("dokuz yüz");
                    break;
            }
        switch (onlar) {

            case 1:
                System.out.println("on");
            case 2:
                System.out.println("yirmi");
            case 3:
                System.out.println("otuz");
            case 4:
                System.out.println("kırk");
            case 5:
                System.out.println("elli");
            case 6:
                System.out.println("altmış");
            case 7:
                System.out.println("yetmiş");
            case 8:
                System.out.println("seksen");
            case 9:
                System.out.println("doksan");
                break;

        }
        switch (birler) {
            case 1:
                System.out.println("bir");
            case 2:
                System.out.println("iki");
            case 3:
                System.out.println("üç");
            case 4:
                System.out.println("dört");
            case 5:
                System.out.println("beş");
            case 6:
                System.out.println("altı");
            case 7:
                System.out.println("yedi");
            case 8:
                System.out.println("sekiz");
            case 9:
                System.out.println("dokuz");
                break;


        }
    }
}
