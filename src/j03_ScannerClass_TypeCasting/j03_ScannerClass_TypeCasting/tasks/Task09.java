package j03_ScannerClass_TypeCasting.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task09 {

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
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin");
        double sayi = scan.nextDouble();
        if (sayi > 0) {
            if (sayi > 10) {
                System.out.println("Buyuksun");
            } else {
                System.out.println("Normalsin");
            }
        } else {
            if (sayi > -10) {
                System.out.println("Negatifsin");
            } else {
                System.out.println("Cok negatifsin");
            }
        }

    }
}