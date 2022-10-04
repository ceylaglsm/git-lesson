package j03_ScannerClass_TypeCasting.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("boy giriniz,kilo giriniz :");
        double boy = sc.nextDouble();

        double kilo = sc.nextDouble();
        double vki = kilo/(boy*boy);
        System.out.println("vücut kitle endeksiniz= " + vki);
        int vki2 = (int) vki;
       System.out.println("vücut kitle endeksiniz= " + vki2);

        
    }
    
}
