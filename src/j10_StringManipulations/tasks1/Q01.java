package j10_StringManipulations.tasks1;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir String değeri giriniz :");
        String str= scanner.nextLine();
        String bsl=" ";
        System.out.println(str.contains(bsl));





    }
}

