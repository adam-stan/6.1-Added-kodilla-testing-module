package various;

public class Substracting {
    public double substracting(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Substracting substracting = new Substracting();
        double result = substracting.substracting(10.5, 5.5);
        System.out.println(result);
    }
}
