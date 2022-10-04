package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime girin: ");
        String x=scanner.nextLine();
        System.out.println("bir kelime girin: ");
        String y=scanner.nextLine();
        kontrolEt(x,y);

    }

    public static void kontrolEt(String x, String y) {
        System.out.println(x.endsWith(y));


    }



    }
