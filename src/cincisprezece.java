public class cincisprezece {
    public static void main(String[] args){
        int n = 4321;
        int m = 1231;
        int aux = n;
        int aux2 = m;
        int ordin = 1;
        int cifra;
        int nr=0;//formeaza inversul lui n
        int c=0;//nr cifre ale lui n
        int d=0;//nr cifre ale lui m
        while (n!=0) {
            n = n / 10;
            ordin = ordin * 10;
            c+=1;
        }
        while (aux2!=0){//numar cifrele lui aux2=m
            aux2 = aux2/10;
            d+=1;
        }
        ordin = ordin/10;
        while (ordin>=1){
            cifra = aux%10;//4,   3,  2, 1
            aux = aux/10;//     123, 12, 1
            nr = nr + cifra * ordin;//0+4*1000, 4000+3*100, 4300+2*10, 4320+1*1
            ordin = ordin/10;//100,10,1
        }
        if (nr == m && c==d){ // numarul format din inversarea cifrelor lui n sa fie egal cu m, dar sa aiba si acelasi nr de cifre m si n
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
