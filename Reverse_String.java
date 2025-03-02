import java.util.Scanner;
class Reverse_String
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter any string to reverse it : ");
        String str = sc.nextLine();
        String s = "";
        for(int i = str.length() - 1; i > -1; i--){
            s += str.charAt(i);
        }
        System.out.println("Reversed String : "+s);
        sc.close();
    }
}