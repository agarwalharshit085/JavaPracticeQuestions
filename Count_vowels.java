import java.util.Scanner;
class Count_Vowels
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str =  sc.next();
        int vowels = 0, consonants = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'||str.charAt(i) == 'u')
            {
                vowels++;
            }else if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'||str.charAt(i) == 'U')
            {
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Number of Vowels present = "+vowels);
        System.out.println("Number of Consonants present = "+consonants);
        sc.close();
    }
}