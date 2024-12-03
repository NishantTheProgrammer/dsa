public class NSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);        
        System.out.println("Sum of " + n + " is " + NSum.nSum(n));
    }

    // returns Sum of first n natural numbers using recucursion
    private static int nSum(int n) {
        if(n <= 1) return n;
        return n + nSum(n - 1);
    }
}