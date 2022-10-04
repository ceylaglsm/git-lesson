package j04_AritmeticOperators.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner sc=new Scanner(System.in);
        int a = 90;
        int b = 40;
        int c = 10;
        int d = 10;


        System.out.println("toplam :"+(a-b-c-d));

    }
}
