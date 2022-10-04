package j03_ScannerClass_TypeCasting.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("günde kaç saat uyuyorsunuz: ");
        int uyku = scanner.nextInt();
        System.out.println("ayda"+(30*uyku)/24+" , "+ "yılda "+ (uyku*365)/24 +" ,"+" 40 yılda "+(uyku*40*365)/24+" gününüz uykuda geçiyor.");
    }
}
