import java.util.*;
class You
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("PLEASE ENTER A STRING");
        String str = sc.nextLine();
        int l=str.length();
        System.out.println(l);
        String s="";
        char space=' ';
        String x[]=str.split(" ");
        int len=x.length;
        for(int i=l-1;i>=0;i--)
        {
            if(str.charAt(i)==space)
            {
                s=s+" ";
            }
            else
            {
                s=s+str.charAt(i);
            }
        }

        System.out.println(s);
    }   
}

