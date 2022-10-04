package j09_SwitchStatement.Taskss;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        int gun = ((kacıncıGun+100)%7);


        switch (gun){
    case 1:
        System.out.println("PAZARTESİ");
        break;
    case 2:
        System.out.println("SALI");
        break;
    case 3:
        System.out.println("ÇARŞAMBA");
        break;
    case 4:
        System.out.println("PERŞEMBE");
        break;
    case 5:
        System.out.println("CUMA");
        break;
    case 6:
        System.out.println("CUMARTESİ");
        break;
    case 0:
        System.out.println("PAZAR");
        break;
    default:
        System.out.println("yanlış giriş");
        break;
}

    }
}

