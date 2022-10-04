package j10_StringManipulations.tasks1;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("bir isim giriniz :");
        String ism= sc.nextLine();
       char harf1= ism.charAt(0);
       char harf2= ism.charAt(1);
       char harf3= ism.charAt(2);
        if (ism.length()==3){
            System.out.println(harf1 != harf2 && harf1!=harf3 && harf2 != harf3 ? "kelimeniz unique":"kelimeniz unique değil");
        }
        else {
            System.out.println("kelimeniz üç harfli değil");
        }




    }
}