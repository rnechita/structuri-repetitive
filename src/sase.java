import java.util.Scanner;
public class sase {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int nr = keyboard.nextInt();
        String a="1";
        int b=1;
        for (int i = nr; i>1; i--){
            b = b+2;
            Integer.toString(b);
            a = a + " " + b;
        }
        System.out.println(a);
    }

}
