import javax.xml.bind.SchemaOutputResolver;

public class opt {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int res = 1;
        for (int i = 0; i < b; i++) {
            res = res * a;
        }
        System.out.println(res);
    }
}

