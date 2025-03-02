// import java.util.Scanner;
// class Reverse{
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         String str =  sc.nextLine();
//         char[] res = str.toCharArray();
//         int n=res.length-1;
//         System.out.println("Reverse  of the string is: ");
//         for (int i =0 ;i<=n/2;i++) {
//             char temp = res[i];
//             res[i] = res[n-i];
//             res[n-i]=temp;
//         }
//         String rev="";
//         for(char c : res){
//             rev +=c;
//         }
//         System.out.println(rev);
//         sc.close();ag
//     }
// }

import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] res = str.toCharArray();
        int n = res.length - 1;
        String rev = "";
        System.out.println("Reverse of the string is: ");
        for (int i = n; i >= 0; i--) {
            rev += res[i];
        }
        System.out.println(rev);
        sc.close();
    }
}

