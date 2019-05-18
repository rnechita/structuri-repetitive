public class saptesprezece {
    public static void main(String[] args){
        int n = 12345;
        int aux = n;
        int c = 0;
        int s = 0;
        int total = 0;;
        while (aux!=0){//nr de cifre ale lui aux=n
            total = total + aux%10;
            aux/=10;
            c+=1;
        }
        if (c%2==0){//pentru numerele cu numar impar de cifre, calculez suma cifrelor incepand de la ultima si deplasandu-ma din 2 in 2 pozitii spre stanga
            n=n/10;//iar pentru numerele cu numar par de cifre, elimin ultima cifra si aplic acelasi algoritm
            while (n!=0){
                s = s+n%10;
                n/=100;
            }
        } else {
            while (n!=0){
                s = s+n%10;
                n/=100;
            }
        }
        System.out.println(total);//suma tuturor cifrelor
        System.out.println(s);//suma cifrelor de pe pozitiile pare
        System.out.println(total-s);//suma cifrelor de pe pozitii impare
        System.out.println(s-(total-s));//par-impar

    }
}
