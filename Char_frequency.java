// import java.util.*;

// class uniqueChars {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any String : ");
//         String str = sc.nextLine();
//         Set<Character> uniqueChars = new HashSet<>();

//         for (int i = 0; i < str.length(); i++) {
//             uniqueChars.add(str.charAt(i));
//         }

//         System.out.println("Unique characters in the string:");
//         for (Character c : uniqueChars) {
//             System.out.print(c +"");
//         }
//         sc.close();
//     }
// }

import java.util.*;
class Char_frequency{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String to count the frequnecy of its characters :");
        String str = sc.nextLine();
        HashMap<Character,Integer> res = new HashMap<>();
        for(int i = 0; i < str.length(); i++)
        {
            if(res.containsKey(str.charAt(i))){
                res.put(str.charAt(i),res.get(str.charAt(i)) + 1 );
            }else{
                res.put(str.charAt(i),1);
            }
        } 
        System.out.println("\nCharacters and their frequencies are as follows:\n");
        for(@SuppressWarnings("rawtypes") Map.Entry e : res.entrySet()) 
        {
            System.out.println( e.getKey()+"  "+e.getValue()+ " ");
        }
        sc.close();
    }
}