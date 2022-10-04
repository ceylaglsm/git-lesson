package j10_StringManipulations.tasks1;

public class isimsoyisim {
    public static void main(String[] args) {
        String isim = "Gulsum Uslu";
       String yeniisim = isim.substring(1,isim.indexOf(" "));
       String yenisoyisim = isim.substring(isim.indexOf(" ")+2);
        String myname = yeniisim.replaceAll("\\w","*");
        String soyisim = yenisoyisim.replaceAll("\\w","*");
        System.out.println(isim.charAt(0)+myname+" "+isim.charAt(isim.indexOf(" ")+1)+soyisim);
        String kartno = "1234567812345678";
        String yenino = kartno.substring(0,12);
        System.out.println(yenino.replaceAll("\\w","*")+kartno.substring(12));







    }
}
