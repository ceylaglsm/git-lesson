package j09_SwitchStatement.Taskss;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();


        switch (gunNo) {
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
            case 7:
                System.out.println("PAZAR");
                break;
            default:
                System.out.println("yanlış giriş");
                break;

        }
    }
}
