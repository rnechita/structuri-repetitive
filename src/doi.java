public class doi {
    public static void main(String[] args) {
        int n = 6;
        int c = 1;
        while (n!=1){
            if (n%2 == 0){
                n = n/2;
            } else
                n = 3*n + 1;
            c=c+1;

        }
        System.out.println(c);
    }

}

