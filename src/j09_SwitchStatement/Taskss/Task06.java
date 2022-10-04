package j09_SwitchStatement.Taskss;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
Scanner scanner = new Scanner(System.in);
		System.out.println("anlamını öğrenmek istediğiniz harfi girin: ");
		char harf = scanner.next().toUpperCase().charAt(0);
		switch (harf){
			case 'V':
				System.out.println("very");
				break;
			case 'I':
				System.out.println("important");
				break;
			case 'P':
				System.out.println("person");
				break;
			default:
				System.out.println("geçersiz karakter girdiniz");


		}







	}
}
