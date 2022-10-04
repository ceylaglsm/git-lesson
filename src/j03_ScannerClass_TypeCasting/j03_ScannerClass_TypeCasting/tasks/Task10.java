package j03_ScannerClass_TypeCasting.j03_ScannerClass_TypeCasting.tasks;


import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

        // c = (f-32)*5/9
        Scanner scanner = new Scanner(System.in);
        System.out.println("celciusa çevirmek istediğiniz fahrenheit değerini giriniz= ");
        double fah = scanner.nextDouble();
        double celcius = (fah-32)*5/9;
        System.out.println(fah+"fahrenheit"+" = "+celcius+"celciusdur.");




    }
}
