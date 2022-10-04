package j10_StringManipulations.tasks;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

        String str = "Alamanya";

       // str.indexOf('a')-> ilk a'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));
        String a = "eklemek";
        int b = a.indexOf('e',a.indexOf('e')+1) ;
        System.out.println(b);

    }
}
