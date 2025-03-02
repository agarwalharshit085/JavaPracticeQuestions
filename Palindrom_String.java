import java.util.*;

class Palindrom_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] res = str.toCharArray();
        int n = res.length - 1;
        String rev = "";
        for (int i = n; i >= 0; i--) {
            rev += res[i];
        }
        System.out.println("Reverse of the string is: "+rev);

        if(rev.equals(str)){
            System.out.println("Palindrome string.");
        }
        else{
            System.out.println("Not palindrome String.");
        }
        sc.close();
    }
}