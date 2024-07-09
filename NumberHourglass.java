public class NumberHourglass {
    public static void main(String[] args) {
        int increment = 1;
        for(int i = 0; i <= 8 && i >= 0; i += increment) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= 8; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
            if(i == 8) increment = -1;
        }
    }
}