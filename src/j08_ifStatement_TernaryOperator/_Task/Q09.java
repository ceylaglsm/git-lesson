package j08_ifStatement_TernaryOperator._Task;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

       /*
            TASK :
            45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */


        Scanner scanner=new Scanner(System.in);
        System.out.println("bir double değeri giriniz");
        double d1= scanner.nextDouble();

        if (d1%5==0 && d1%8==0){
            System.out.println("able to divide by 5 and 8");
        }
        if (d1%10==0 && d1%9==0) {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");

        }
    }
    }
