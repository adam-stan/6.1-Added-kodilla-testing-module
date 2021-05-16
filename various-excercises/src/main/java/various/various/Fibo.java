package various.various;

public class Fibo {

    public static long fibo(int n) {
        long x1 = 1;
        long x2 = 1;
        for (int i = 3; i <+ n; i++) {
            long temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        return x2;
    }

    public static void main(String[] args) {
        System.out.println(fibo(8));

    }
}