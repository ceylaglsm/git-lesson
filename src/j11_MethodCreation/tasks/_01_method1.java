package j11_MethodCreation.tasks;

import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int max = scanner.nextInt();
        System.out.println(randomNum(max));
    }
    public static int randomNum(int max){
        double maxx = Math.random()*max;
        return (int) maxx;
    }
}