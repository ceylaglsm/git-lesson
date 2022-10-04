package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner scanner =new Scanner(System.in);
		System.out.println("bir saat giriniz");
		double saat = scanner.nextDouble();
		System.out.println("bir mil değeri giriniz");
		double mil = scanner.nextDouble();
		System.out.println("bir kilogram değeri giriniz");
		double kg = scanner.nextDouble();
		milCevir(mil);
		saatCevir(saat);
		kgCevir(kg);



	}

	public static void kgCevir(double kg) {
		double grsonuc = kg*1000 ;
		System.out.println(grsonuc);
	}

	public static void saatCevir(double saat) {
		double snysonuc = saat*3600 ;
		System.out.println(snysonuc);

	}

	public static void milCevir(double mil) {
		double kmsonuc = mil*1.609;
		System.out.println(kmsonuc);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
