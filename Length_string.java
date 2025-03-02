import java.util.*;
class Length_String{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string : ");
        String s = sc.nextLine();
        int l = count_length(s);
        System.out.println("Length of String is : "+l);
        sc.close();
    }
 
    public static int count_length(String str){
        int count = 0;
       
        for(@SuppressWarnings("unused") char c : str.toCharArray())
        {
            count++;
        }
        return count;
    }
}