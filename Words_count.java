import java.util.Scanner;
class count_Words{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to count the number of words in it : ");
        String str = sc.nextLine();
        int count = 1;
        for(int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ' && i != 0 && i != str.length() - 1) {
                count++;
            }
        }
        System.out.println("Wors : "+count);
        sc.close();
    }
}