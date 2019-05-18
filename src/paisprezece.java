public class paisprezece {
    public static void main(String[] args){
        int n=5;
        int c=0;
        while (c<n){
            System.out.println("going");
            c+=1;
        }
        System.out.println("al 2-lea while");
        while (true){
            System.out.println("still going");
            c-=1;
            if (c==0){
                break;
            }
        }
    }
}
