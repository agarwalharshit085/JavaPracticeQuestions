//import java.io.*;
import java.util.*;
class Binary
{
    public static void main(String args[])
    {
        Scanner c =new Scanner(System.in);

        String str="";
        int n=c.nextInt();
        int t=n;
        int d=0;
        while(t>0)
        {
            d=t%2;
            t=t/2;
            str=str+d;
        }
        String bin="";
        for (int i=str.length()-1;i>=0;i--)
        {
            bin=bin+str.charAt(i);
            System.out.println(str.charAt(i));
        }
        System.out.println(bin);
        System.out.println(str);
        
        int l=Integer.parseInt(str);
        System.out.println(l);
        // IN l we have the reversed binary number of the actual number entered by the us
        double base=0,k=0,r=0;
        for(int j=l;j>0;j=j/10)
        {
            r=j%10;
            base=base+(r*Math.pow(2,k));
            k++;
        }
        System.out.println(base);
        c.close();
    }
}
