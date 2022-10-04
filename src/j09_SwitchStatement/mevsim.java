package j09_SwitchStatement;

import java.util.Scanner;

public class mevsim {
    public static void main(String[] args) {
        //girilen ayın hangi mevsime ait olduğunu print eden  kod
        Scanner scanner = new Scanner(System.in);
        System.out.println("ay giriniz : ");
        String ay = scanner.next().toUpperCase();
        switch (ay) {
            case "ARALIK":
            case "OCAK":
            case "ŞUBAT":
                System.out.println("kış mevsimindesiniz");
                break;
            case "MART":
            case "NİSAN":
            case "MAYIS":
                System.out.println("ilkbahar mevsimindesiniz");
                break;
            case "HAZİRAN":
            case "TEMMUZ":
            case "AGUSTOS":

                System.out.println("yaz mevsimindesiniz");
                break;
            case "EYLÜL":
            case "EKIM":
            case "KASIM":
                System.out.println("sonbahar mevsimindesiniz");
                break;
            default:
                System.out.println("hatalı giriş yaptınız");


        }


    }
}
