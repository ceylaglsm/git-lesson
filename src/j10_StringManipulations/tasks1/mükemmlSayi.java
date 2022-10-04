package j10_StringManipulations.tasks1;

import java.util.Scanner;

public class mükemmlSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
        int number =scanner.nextInt();
        int tplm = 0;
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0) {
                tplm += i;
            }


        }
        if (tplm == number){
            System.out.println(number+"  mükemmel sayı");
        }
        else {
            System.out.println(number+"  mükemmel sayı değil");
        }
    }
}