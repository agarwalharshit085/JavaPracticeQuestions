import java.util.*;
import java.util.Arrays;
class Mathematics
{
    static boolean[] seiveOfEratoSthenes(int a)
    {
        boolean isPrime[]=new boolean[a+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=a;i++){
            for(int j=2*i;j<=a;j+=i)
            {
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("PLEASE ENTER THE RANGE UPTO WHICH YOU WANT TO FIND THE PRIME NUMBER");
        int n=sc.nextInt();
        boolean isPrime[]=seiveOfEratoSthenes(n);
        for(int i=0;i<=n;i++)
        {
            System.out.println(i+" :"+isPrime[i]);
        }
        sc.close();
    }
}