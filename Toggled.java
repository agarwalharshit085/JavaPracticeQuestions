import java.util.*;
class Toggle_Case{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string.");
        String str = sc.nextLine();
        sc.close();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
            {
                str = str.replace(ch, Character.toUpperCase(ch));
            }
            else {
                str = str.replace(ch, Character.toLowerCase(ch));
            }
        }
        System.out.println("Toggled String is : " + str);
    }
}