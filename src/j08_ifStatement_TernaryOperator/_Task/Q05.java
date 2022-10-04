package j08_ifStatement_TernaryOperator._Task;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */


        Scanner scanner =new Scanner(System.in);
        System.out.println("Yaşınızı ve kilonuzu giriniz :");
        int yas=scanner.nextInt();
        int kilo=scanner.nextInt();
        if (yas<18){
            System.out.println("kan bagisi yapamaz");
        } else if (yas>=18&&kilo<50) {
            System.out.println("kan bagisi yapamaz");
        } else if (yas>=18&&kilo>50) {
            System.out.println("kan bagisi yapabilir");

        }

    }


    }
