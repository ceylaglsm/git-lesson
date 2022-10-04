package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

            //Task14

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

