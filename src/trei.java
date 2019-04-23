import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.*;
public class trei {
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
        int maxim = -1;
        for (int i=0; i<nr;i++){
            if(listA.get(i)>maxim && listA.get(i)%2!=0){
                maxim = listA.get(i);
            }
        }
        if (maxim ==-1){
            System.out.println("no");
        } else
            System.out.println(maxim);
    }

}
