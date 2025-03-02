class Fibonacci
{
    public static void main(String args[])
    {
        System.out.println(fibonacci(50));
    }
    public static int fibonacci(int n)
    {
        int num = 0;
        if(n == 0)
        {
            // System.out.println(0);
            return 0;
        }
        if(n == 1) 
        { 
            // System.out.println(1);
            return 1;
        }
        if(n > 1){
            num = fibonacci(n - 1) + fibonacci(n - 2);
            // System.out.println(num);
        }
        return num;
    }
}