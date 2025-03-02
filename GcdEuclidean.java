import java.util.*;
class GCD
{
    static long gcd(long a,long b)
    {
        if(b==0) return a;
        return gcd(b,a%b); 
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER TWO NUMBERS IN ORDER TO FIND GCD ");
        long n1=sc.nextInt();
        long n2=sc.nextInt();
        long gcd=gcd(n1,n2);
        System.out.println(gcd);
        sc.close();
    }
}