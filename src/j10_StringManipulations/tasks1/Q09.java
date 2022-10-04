package j10_StringManipulations.tasks1;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string giriniz : ");
        String str = scanner.nextLine();
        int uzunlk = str.length();
        String a = str.substring(0, uzunlk / 2);
        String yarı = (uzunlk % 2 == 0 ? a : "girdiğiniz kelimenin yarısı yoktur!");


        System.out.println("girdiğiniz kelimenin ilk yarısı: " + yarı);

    }
}
//bir string giriniz :
//  gülsüm
//girdiğiniz kelimenin ilk yarısı: gül
