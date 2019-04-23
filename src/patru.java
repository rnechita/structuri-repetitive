import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class patru {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int nr = keyboard.nextInt();
        ArrayList<Integer> listA = new ArrayList<Integer>(nr);

        Random rand = new Random();
        for (int i=0; i<nr;i++){
            int x = rand.nextInt(10);
            listA.add(x);
        }
        System.out.println(listA);
        int c=0;
        int d=0;
        for (int i=0; i<nr;i++){
            if(listA.get(i)%2 == 0){
                c = c+1;
            } else
                d = d+1;
        }
            System.out.println(c + " numere pare si " + d + " numere impare");
    }

}
