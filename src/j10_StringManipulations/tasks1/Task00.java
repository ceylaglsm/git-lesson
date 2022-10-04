package j10_StringManipulations.tasks1;

import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {

        // bir arkadaşınızdan kredi alıyorsunuz ve 3 ay sonra ona ne kadar borcunuz olacağını
        //hesaplayalım.Her ay kalan kredi tutarının %10 unu ona geri ödeyeceğim.Kredi tutarını girdi alarak
        //alan,kalan tutarı hesaplayıp 3 ay sonra çıktısını veren code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("password giriniz :");
        //int amount =scanner.nextInt();
        String password = scanner.nextLine();

            if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
                if (password.charAt(password.length() - 1) >= 0 && password.charAt(password.length() - 1) <= 9) {
                    if (password.length() >= 6) {



                    }
                }
                System.out.println("şifre geçerli");
            }

         else {
            System.out.println("geçersiz şifre");
        }


    }
}
