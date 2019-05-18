public class zece {
    public static void main(String[] args){
        int[] sir = {1, 5, 4, 17, 4, 2, 10, 11, 6, 2, 11};
        int c = 0;
        int rez = 0;
        for (int i=0; i<sir.length;i++){
            if(sir[i]%2==0 && c<5){
                rez = rez + sir[i];
                c+=1;
            }
        }
        if (c!=5){
            System.out.println("nu sunt 5 numere prime in lista");
        } else {
            System.out.println(rez);
        }

    }
}
