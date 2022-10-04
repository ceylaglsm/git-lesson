package j10_StringManipulations.tasks1;

public class kalnses {
    public static void main(String[] args) {

        char harf = 'Ö';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalın seli harfler");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("ince sesli harfler");
                break;
            default:
                System.out.println("geçersiz harf girdiniz");
        }


        int sayi = 75;
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }

        }

        if (toplam == sayi) {
            System.out.println("sayı mükemmel sayıdır");
        } else {
            System.out.println("sayı mükemmel sayı değildir");
        }

    }
}