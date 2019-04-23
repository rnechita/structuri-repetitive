public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        String a = "";
        String b = "";
        for (int i=0;i<7;i++){
            if (x<=4){
                a = a + "#";
                b = b+ a + " ";
                x = x + 1;}
            else if (y!=0) {
                a = "";
                for (int j=0;j<y;j++){
                    a = a + "#";
                }
                b = b + a + " ";
                y = y -1;
            }
        }
        System.out.println(b);
    }
}
