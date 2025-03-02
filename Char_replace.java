import java.util.Scanner;

class Char_replace
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string. ");
        String str = sc.next();
        String str1 = str.replace('a','s');
        System.out.println(str1);
        sc.close();
    }
}