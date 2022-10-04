package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		Scanner scanner =new Scanner(System.in);
		System.out.println("bir şekil seçiniz dikdörtgen, üçgen,paralelkenar");
		String sekil = scanner.nextLine().toLowerCase();

		alanCevreHesap(sekil);
	}

	public static void alanCevreHesap(String sekil) {
		if (sekil.equals("üçgen")){
			Scanner scanner = new Scanner(System.in);
			System.out.println(" ikizkenar üçgenin kenarlarını ve yüksekliğini giriniz: ");
			int kenar =scanner.nextInt();
			int yukseklik =scanner.nextInt();
			System.out.println("üçgenin alanı :"+((kenar*yukseklik)/2));
			System.out.println("üçgenin cevresi :"+(kenar*3));

		} else if (sekil.equals("dikdörtgen")) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" dikdörtgenin kenarlarını giriniz: ");
			int kenar =scanner.nextInt();
			int yukseklik =scanner.nextInt();
			System.out.println("dikdörtgenin alanı :"+(kenar*yukseklik));
			System.out.println("dikdörtgenin çevresi :"+((kenar+yukseklik)*2));


		} else if (sekil.equals("paralelkenar")) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" paralelkenarın kenarlarını giriniz: ");
			int kenar =scanner.nextInt();
			int yukseklik =scanner.nextInt();
			System.out.println("paralelkenarın alanı :"+(kenar*yukseklik));
			System.out.println("paralelkenarın çevresi :"+(kenar*4));
		}else System.out.println("hatalı giriş yaptınız");
	}


}
