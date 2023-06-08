package Split;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp chuỗi vào ban ơi ");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        for ( String word:words) {
            System.out.println("số từ tỏg chuỗi là : " + word);
        }

    }
}
