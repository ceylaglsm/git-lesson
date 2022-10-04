package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
        //Girilen  pozitif birtamsayının 2 veya daha fazla basamaklı olmasını kontrol  eden kod
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = scanner.nextInt();
        System.out.println(sayi>9?"sayı ik ve ya daha fazla basamaklı":"sayı tek basamaklı");
String sonuc =sayi > 9 ? "sayı iki ve ya daha fazla basamaklı":"sayı tek basamaklı";
        System.out.println("sonuc = " + sonuc);
    }
}
