package j03_ScannerClass_TypeCasting.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ara sınav notu, final notu ve proje notunu girin");
        int arasinavNotu = sc.nextInt();
        int finalNotu = sc.nextInt();
        int projeNotu = sc.nextInt();
        System.out.println("Sınav notlarınız  : " + arasinavNotu + ", " + finalNotu);
        System.out.println("Proje notunuz : " + projeNotu);
        System.out.println("Genel Notunuz = " +((arasinavNotu*0.3) + (finalNotu*0.2)+(projeNotu*0.5)));
      //  sc.close();
    }
}
