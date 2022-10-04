package j09_SwitchStatement.Taskss;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

  /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */
        Scanner sc = new Scanner(System.in);


        System.out.println("Bakiye öğrenme -> 1\nPara yatırma -> 2\nPara cekme -> 3\nÇıkış -> 4\nGiriniz : ");
        int secim = sc.nextInt();
        int bakiye = 1000;

        switch (secim){
            case 1:
                System.out.println("bakiyeniz: "+bakiye);
                break;
            case 2:
                System.out.println("yatıracağınız miktarı girin: ");
                int yatrlanpara= sc.nextInt();
                bakiye += yatrlanpara;
                System.out.println("bakiyeniz: "+ bakiye);
                break;
            case 3:
                System.out.println("çekeceğiniz miktarı giriniz");
                int ceklnpara = sc.nextInt();
                if (ceklnpara>bakiye){
                    System.out.println("yetersiz bakiye");

                }
                else {
                    bakiye -= ceklnpara;
                    System.out.println("bakiyeniz:"+bakiye);
                }
                break;
            case 4:
                System.out.println("yeniden bekleriz güle güle");
                break;
            default:
                System.out.println("geçersiz talep!");
        }




    }




}
