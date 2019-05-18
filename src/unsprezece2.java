public class unsprezece2 {
    public static void main(String[] args){
        int n = 15;
        String[] numere = {"numar gresit", "unu", "doi", "trei", "patru", "cinci", "sase,", "sapte", "opt", "noua"};
        int c = 0;
        for (int i = 0; i <numere.length ; i++) {
            if (n==i){
                System.out.println(numere[i]);
                c+=1;
            }
            if (i == numere.length - 1 && c == 0){ //evaluez c-ul doar cand termin de parcurs for-ul - se afiseaza doar o data mesajul numar gresit
                System.out.println("numar gresit");
            }

        }
    }
}
