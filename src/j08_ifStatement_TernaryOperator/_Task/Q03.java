package j08_ifStatement_TernaryOperator._Task;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Boyunuzu ve kilonuzu giriniz :");
        double m= scanner.nextDouble();
        double kg= scanner.nextDouble();
        double BMI=(kg)/(m*m);
        if(BMI <=20){
            System.out.println("oldukca zayifsiniz");
        } else if (20<BMI&&BMI<=25) {
            System.out.println("Normal sinirlardasiniz");

        } else if (25<BMI&&BMI<=30) {
            System.out.println("Sisman kategorisindesiniz");

        }else{
            System.out.println("Obez grubundasiniz");
        }

        }


    }


