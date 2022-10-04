package j08_ifStatement_TernaryOperator._Task;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {


    Scanner scanner=new Scanner(System.in);
        System.out.println("aldığınız ürün adedini,liste fiyatını ve müşteri kartınızın olup olmadığını yazınız (true/false)");
        int adt= scanner.nextInt();
        int fyt= scanner.nextInt();
        boolean kart= scanner.nextBoolean();
        int para=(adt*fyt);
        if (kart==true){
            if (adt>10){
                System.out.println("ödemeniz gereken"+(para*0.8));
            } else if (adt<10) {
                System.out.println("ödemeniz gereken"+(para*0.85));
            }

            }
        if (kart==false){
            if (adt>10){
                System.out.println("ödemeniz gereken"+(para*0.85));

            } else if (adt<10) {
                System.out.println("ödemeniz gereken"+(para*0.90));

            }
        }
        }

}
