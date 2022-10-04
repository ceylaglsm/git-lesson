package j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

        Scanner sc =new Scanner(System.in);
        System.out.println("double1 ve double2 isimli iki tane double değeri giriniz :");
        double double1= sc.nextDouble();
        double double2= sc.nextDouble();
        System.out.println(double1>double2 ? "double 1 is greater than double 2" : "double 1 is smaller than double 2");



    }
}
