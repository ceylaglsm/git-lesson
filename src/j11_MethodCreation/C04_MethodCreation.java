package j11_MethodCreation;

public class C04_MethodCreation {//motor

    public static void main(String[] args) {
        String name = "haluk";
        System.out.println("car car "+name);
        C04_MethodDepo.gecmeNotu(24);//depo class'tan class name ile method call edildi
        C04_MethodDepo.topla(3, 5);//8 diğer köy amelesi...
    /*
    farkl&#x131; class'dan method call etmek i&ccedil;in..
    1. method static_> g&ouml;kteki g&uuml;ne&#x15F; gibi
    2.ClassName.methodName() &#x15F;eklinde call edilir
     ayn&#x131; class'daki method do&#x11F;rudan methodName ile call edilir...
      */
        selamVer();//aynı class'dan methodName ile call edildi->kendi köyümün amelesi
    }//main dışı

    public static void selamVer() {
        System.out.println("agam selamlar Dewamkeee :)");
    }
}