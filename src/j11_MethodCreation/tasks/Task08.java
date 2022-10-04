package j11_MethodCreation.tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scanner =new Scanner(System.in);
        System.out.println("hesaplamak istediğiniz yılı giriniz: ");
        int yil = scanner.nextInt();
        artikyilbul(yil);


    }

    public static void artikyilbul(int yil) {
        if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0) {
        System.out.println("true");
    } else System.out.println("false");

    }
}
