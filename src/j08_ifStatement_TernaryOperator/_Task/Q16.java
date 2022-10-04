package j08_ifStatement_TernaryOperator._Task;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("3 adet numara giriniz");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("en büyük "+num1);

        } else if (num1<num2&&num1<num3) {
            System.out.println("en küçük "+num1);

        }
        if (num2>num1&&num2>num3){
            System.out.println("en büyük "+num2);
        } else if (num2<num1&&num2<num3) {
            System.out.println("en küçük "+num2);

        }
        if (num3>num1&&num3>num2){
            System.out.println("en büyük "+num3);
        } else if (num3<num1&&num3<num2) {
            System.out.println("en küçük "+num3);

        }

    }
    }

