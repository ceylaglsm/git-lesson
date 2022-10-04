package j10_StringManipulations.tasks;

import java.util.Scanner;

public class _07_String_methods04 {

    public static void main(String[] args) {

        /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */

        //Kodu aşağıya yazınız.


            Scanner scanner = new Scanner(System.in);
            System.out.println("kelime gir");
            String word1 = scanner.nextLine();
            System.out.println("kelime gir");
            String word2 = scanner.nextLine();
            if (word1.length() % 2 == 0) {
                String a = word1.substring(0, word1.length() / 2) + word2 + word1.substring(word1.length() / 2);
                System.out.println(a);
            } else {
                System.out.println("kelime 2 kelime 1 e eklenemez");
            }


    }
}
