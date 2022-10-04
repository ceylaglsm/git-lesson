package j10_StringManipulations.tasks1;

import java.util.Scanner;

public class kalnSesliHarf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sesli bir harf giriniz: a=1,ı=2,o=3,u=4,e=5,i=6,ö=8 : ");
       int harf = scanner.nextInt();
       switch (harf){
           case 1:
           case 2:
           case 3:
           case 4:
               System.out.println("kalın sesli harf");
               break;
           case 5:
           case 6:
           case 7:
           case 8:
               System.out.println("ince sesli harf");
               break;
           default:
               System.out.println("yanlış karakter girdiniz.");

       }

    }
}
