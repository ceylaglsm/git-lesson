package j04_AritmeticOperators.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */


        Scanner sc=new Scanner(System.in);
        System.out.println("iki adet sayı giriniz :");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        System.out.println("toplam :"+(num1+num2));
    }
}
