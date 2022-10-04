package j03_ScannerClass_TypeCasting.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        Scanner scanner = new Scanner(System.in);
        System.out.println("üçgenin dik kenar uzunluklarını giriniz = ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c =Math.sqrt(a*a+b*b);

        System.out.println("hipotenüs = "+c);






    }
}
