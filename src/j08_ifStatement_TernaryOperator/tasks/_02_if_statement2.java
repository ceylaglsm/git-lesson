package j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _02_if_statement2 {

    public static void main(String[] args) {

        /*İki tane int oluşturun. Birinci (1.) int 26. İkinci (2.) int 35.
          Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
          Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın. */

        //Kodu aşağıya yazınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("İki sayı giriniz :");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        if (sayi1>sayi2){
            System.out.println("int 1 is greater than 2");
        }else{
            System.out.println("int 1 is smaller than 2");
        }







    }
}
