package CheckValidate;

import java.util.Scanner;

public class CheckValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String emailAddress= sc.nextLine();
        System.out.println("email đã được validate + " + checkEmail(emailAddress));
    }
    public static boolean  checkEmail( String email){
        String regex= "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return  email.matches(regex);
    }
}

