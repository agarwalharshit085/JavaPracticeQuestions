class DP_Fibonacci {
    public static void main(String args[]) {
        System.out.println("Enter the range up to which you want the Fibonacci series: ");
        int range = 50;
        int[] fib = new int[range];
        fib[0] = 0;
        fib[1] = 1;
        
        System.out.println("Fibonacci series:");
        System.out.print(fib[0] + "\n" + fib[1]+"\n");

        for (int i = 2; i < range; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i]);
        }
    }
}
