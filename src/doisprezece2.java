public class doisprezece2 {
    public static void main(String[] args){
        int n = 3;
        String[] luni = {"luna invalida", "iarna", "iarna", "primavara", "primavara", "primavara", "vara", "vara,", "vara", "toamna", "toamna", "toamna", "iarna"};
        int c = 0;
        for (int i = 0; i <luni.length ; i++) {
            if (n==i){
                System.out.println(luni[i]);
                c+=1;
            }
            if (i == luni.length - 1 && c == 0){ //evaluez c-ul doar cand termin de parcurs for-ul - se afiseaza doar o data mesajul luna invalida
                System.out.println("luna invalida");
            }

        }
    }
}
