package j04_AritmeticOperators.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen üç basamklı sayı giriniz: ");
		int sayi =scanner.nextInt();
		System.out.println((sayi / 100)+(sayi %10 ));


		
	}

}
