package j04_AritmeticOperators.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

        Scanner sc=new Scanner(System.in);
        System.out.println("dört adet sayı giriniz :");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();

        System.out.println("toplam :"+(num1+num2+num3+num4));
    }

    }

