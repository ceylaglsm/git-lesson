package j10_StringManipulations.tasks1;

public class Task02 {
    public static void main(String[] args) {
        String password = "abcdefhljkl";
        if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
            if ((password.charAt(password.length() - 1) >= 0 && password.charAt(password.length() - 1) <= 9))
            {
                if (password.length() >= 6) {
                    System.out.println("şifreniz geçerli");
                }


            }

        }

        else{
            System.out.println("kod geçerli değil");
        }
       char a= password.charAt(4);
        System.out.println(a);
    }
}