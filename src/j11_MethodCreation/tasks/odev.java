package j11_MethodCreation.tasks;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Saatlik çalışma ücretinizi giriniz: ");
        double calsmaucret = scanner.nextDouble();
        System.out.println("hangi saat başladınız : ");
        double baslamasaat = scanner.nextDouble();
        System.out.println("hangi saat bitirdiniz işi : ");
        double bitirmesaat = scanner.nextDouble();
        System.out.println("mesaiyi kaçla katlayacağız : ");
double mesai= scanner.nextDouble();
ucretHesapla(calsmaucret,baslamasaat,bitirmesaat,mesai);
    }

    public static double ucretHesapla(double calsmaucret,double baslamasaat,double bitirmesaat,double mesai) {
        if ((bitirmesaat-baslamasaat)<=8){
          double ucret =(bitirmesaat-baslamasaat)*calsmaucret;
            System.out.println("toplam ücretiniz: "+ucret);
          return ucret;
        }else {
            double ucret = ((8)*calsmaucret+(bitirmesaat-baslamasaat-8)*calsmaucret*mesai);
            System.out.println("toplam mesaili ücretiniz : "+ucret);
            return ucret;
        }

    }


}