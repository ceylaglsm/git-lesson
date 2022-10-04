package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("şifrelemek istediğiniz cümleyi giriniz: ");
        String cumle = scanner.nextLine();
        hackerDili(cumle);
    }

    public static String hackerDili(String cumle) {
        String sifre = cumle.replaceAll("a", "4")
                .replaceAll("s", "5")
                        .replaceAll("e", "3")
                        .replaceAll("i", "1")
                                .replaceAll("o", "0");
        System.out.println(sifre);
        return sifre;

    }

}
