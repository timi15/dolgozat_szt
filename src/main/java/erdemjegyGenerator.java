public class erdemjegyGenerator {

    public static void main(String[] args) {
        System.out.println(generator(-1));
    }

    public static int generator(int n) {

        int osszeg=0;
        for (int i = 0; i < n; i++) {
           int veletlen =(int)(Math.random()*5)+1;
           osszeg+=veletlen;
        }


    return (int)(Math.round(osszeg*1.0/n));


    }


}

