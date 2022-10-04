package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {
		/*
		 Nested If : Ic ice girmis if statementlar
		 */
		/*
		 Kullanicidan bir sayi alin

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
		 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int a=scanner.nextInt();
        if(a>0){
            if (a>10){
                System.out.println("Buyuksun!");
            } else if (a<10) {
                System.out.println("Normalsin!");

            }

        }
        if (a<0){
            if (a>-10){
                System.out.println("Negatifsin!");

            } else if (a<-10) {
                System.out.println("Cok Negatifsin!");

            }
        }
        }
    }