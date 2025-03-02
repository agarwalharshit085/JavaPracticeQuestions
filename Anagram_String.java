// Question :- In what way the two strings should be compared to determine whether they  are anagrams or not.
// import java.util.*;
// class Anagram_String
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter 1st String : ");
//         String str1 = sc.nextLine();
//         System.out.println("\n Enter 2nd String : ");
//         String  str2 = sc.nextLine();

//         boolean flag = false;
//         if(str1.length() != str2.length()){
//             System.out.println("Strings are not anagram.");
//         }else {
//             for(int i = 0; i < str1.length(); i++)
//             {
//                 for(int j = 0; j < str2.length(); j++)
//                 {
//                     if(str1.charAt(i) == str2.charAt(j))
//                     { 
//                         flag = true;
//                     }
//                 }
//                 if(flag == false)
//                 {
//                     System.out.println("Strings are not anagram.");
//                     break;
//                 }
//             }
//             if(flag == true)
//                 System.out.println("Strings are anagram.");
//         }
//         sc.close();
//     }
// }



import java.util.*;

class Anagram_String{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two Strings : ");
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            if(str1.length() != str2.length()){
                System.out.println("Not an Anagram String.");
                return;
            }
            else{
                HashMap<Character,Integer> temp = new HashMap<>();

                for(int i = 0; i < str1.length(); i++)
                {
                    if(temp.containsKey(str1.charAt(i)))
                    {
                        temp.put(str1.charAt(i), temp.get(str1.charAt(i))+1);
                    }else{
                        temp.put(str1.charAt(i), 1  );
                    }
                }

                for(int i = 0; i < str2.length(); i++)
                {
                    if(temp.containsKey(str2.charAt(i)))
                    {
                        temp.put(str2.charAt(i), temp.get(str2.charAt(i)) - 1);
                        if (temp.get(str2.charAt(i)) < 0) {
                            System.out.println("Not anagram");
                            return;
                        }
                    }
                }

                Set<Character> key =  temp.keySet();
                for(char x : key)
                {
                    if(temp.get(x) != 0){
                        System.out.println("Not anagram");
                        break;
                    }else{
                        System.out.println("Anagram strings .");
                        break;
                    }
                }
            }
            sc.close();
        }
    }
}