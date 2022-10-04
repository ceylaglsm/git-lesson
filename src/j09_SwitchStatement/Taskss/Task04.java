package j09_SwitchStatement.Taskss;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir ay giriniz :");
        String ay = scanner.next().toLowerCase();
        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println(ay + ":31 gündür.");
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println(ay + ":30 gündür");
                break;
            case "şubat":
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("hangi yılda olduğunuzu giriniz :");
                int yil = scanner1.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("şubat 29 gün çeker");
                } else {
                    System.out.println("şubat 28 gün çeker");
                }
                break;
            default:
                System.out.println("geçersiz data");



        }

    }
}