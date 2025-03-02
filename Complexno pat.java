import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the value of N");
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>0;j--)
            {
                if(j>i)
                {
                System.out.print(j+" ");
                }
                else
                {
                System.out.print(i+" ");
                }
            }
            int k=i;
            for(int a=2;a<=n;a++)       
            { 
                if(k>a)
                {
                    System.out.print(k+" ");
                }
                else
                {
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=n;j>0;j--)
            {
                if(j>i)
                {
                System.out.print(j+" ");
                }
                else
                {
                System.out.print(i+" ");
                }
            }
            int k=i;
            for(int a=2;a<=n;a++)       
            { 
                if(k>a)
                {
                    System.out.print(k+" ");
                }
                else
                {
                    System.out.print(a+" ");
                }
            }
            System.out.println();
    }
}
}
    
