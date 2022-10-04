package j03_ScannerClass_TypeCasting.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
Scanner scanner = new Scanner(System.in);
        System.out.println("vize 1 , vize 2 ve final notlarınızı giriniz : ");
        double vize1 =scanner.nextDouble();
        double vize2 =scanner.nextDouble();
        double fin =scanner.nextDouble();
        System.out.println("ortalamanız= "+ (((vize1+vize2)/2)*0.3+fin*0.7));



    }
}
