import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class cinci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int nr = keyboard.nextInt();
        String a="";
        for (int i = nr; i>0; i--){
            a = a + i + " ";
        }
            System.out.println(a);
    }

}
