package j04_AritmeticOperators.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("çiftlikteki inek ,koyun ve tavuk sayılarını giriniz: ");
        int inek = scanner.nextInt();
        int koyun = scanner.nextInt();
        int tavuk = scanner.nextInt();
        System.out.println("çiftlikteki toplam ayak sayısı: "+((inek+koyun)*4+tavuk*2));



    }

}
