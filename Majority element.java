// // Majority element (>n/2) times
// import java.util.*;
// class Majority
// {
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner (System.in);
//         System.out.println("ENTER THE RANGE OF THE ARRAY :");
//         int n= sc.nextInt();
//         int l=n/2;
//         int max=0;
//         int A[]= new int[n];
//         System.out.println(" ENTER THE ARRAY ELEMENT :");
//         for(int i=0;i<n;i++)
//         {
//             A[i]=sc.nextInt();
//         }
//         int count =0;
//         for(int i=0;i<n;i++)
//         {
//             count =0;
//             for(int j=1;j<n;j++)
//             {
//                 if(A[i]==A[j])
//                 {
//                     count++;
//                     if(count>l)
//                     { 
//                         max=A[i];
//                         break;
//                     }
//                 }
//                 else{
//                     continue;
//                 }
                
//             }
//         }
//         System.out.println(" MAJORITY ELEMENT IS : "+max);        
//     }
// }

// Moore's voting algorithm  time complexity : O(N) space compexity : O(1)  
// import java.util.*;
// class Solution {
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("ENTER THE ARRAY SIZE :");
//         int n= sc.nextInt();
//         int nums[]= new int[n];
//         System.out.println(" ENTER THE ARRAY ELEMENTS :");
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         int count = 0;
//         int candidate = 0;

//         for (int num : nums) 
//         {
//             if (count == 0) {
//                 candidate = num;
//             }
//             if(num==candidate)
//             count += 1; 
//             else 
//             {
//                 count -= 1; 
//             }
//         }
//         System.out.println("\t"+candidate);
//     }
// }