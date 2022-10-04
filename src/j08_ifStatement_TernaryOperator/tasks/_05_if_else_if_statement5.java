package j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        Scanner sc =new Scanner(System.in);
        System.out.println("double1 ve double2 isimli iki tane double değeri giriniz :");
        double double1= sc.nextDouble();
        double double2= sc.nextDouble();
        if (double1>double2){
            System.out.println("Hello World");
        } else if ( double1<double2) {
            System.out.println("Not Hello World");

        }else {
            System.out.println("I love java");
        }


    }
}
