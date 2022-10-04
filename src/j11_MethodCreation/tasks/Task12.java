package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("doğru bir email adresi giriniz: ");
        String email = scanner.nextLine();
        validateEmail(email);


    }

    public static boolean validateEmail(String Email) {
        boolean sonuc = true;
        if (Email.contains("@") && Email.contains(".") && Email.charAt(0) != '@') {
            System.out.println(sonuc);
            return sonuc;


        } else {
            sonuc = false;
            System.out.println(sonuc);
            return sonuc;


        }
    }
}





