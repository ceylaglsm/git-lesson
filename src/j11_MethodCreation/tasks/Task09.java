package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scanner= new Scanner(System.in);
        System.out.println("saniyeye çevrilmesini istediğiniz saati giriniz: ");
        int saat = scanner.nextInt();
        howManySeconds(saat);


    }

    public static int howManySeconds(int saat) {
        int saniye= saat*3600;
        System.out.println("saniye = " + saniye);
        return saniye;


    }
}
