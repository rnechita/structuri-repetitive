import java.util.Scanner;
public class sapte {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int nr = keyboard.nextInt();
        int a = 1;
        int i;
        int s=0;
        for (i = 0; i < nr; i++) {
            a = a * 3;
        }
        int rez = 2 * a;
        System.out.println(rez);
        System.out.println((Integer.toString(rez)).charAt(0));
        for (i = 0; i < (Integer.toString(rez)).length(); i++) {
            s = s + (Integer.toString(rez).charAt(i) - '0');
        }

        System.out.println(s);
}
}

