public class Factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);        
        System.out.println("Factorial of " + n + " is " + Factorial.fact(n));

    }

    static private int fact(int n) {
        if(n <= 1) return 1;
        return n * fact(n - 1);
    }
}
