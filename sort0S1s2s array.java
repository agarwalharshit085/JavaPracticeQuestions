// NORMAL APPROACH 
//  TIME COMPLEXITY : O(N)+O(N)
// import java.util.*;
// class Sort0s1s2s
// {
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("ENTER THE RANGE OF THE ARRAY :");
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         int zero=0,one=0,two=0;
//         System.out.println("ENTER THE ARRAY ELEMENTS IN 0S 1S AND 2S ONLY :");
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             if(a[i]==0)
//                 zero++;
//             else if(a[i]==1)
//                 one++;
//             else 
//                 two++;
//         }
//         for(int j=0;j<zero;j++){
//             a[j]=0;
//         }
//         for(int j=zero;j<(zero+one);j++){
//             a[j]=1;
//         }
//         for(int j=(zero+one);j<n;j++){
//             a[j]=2;
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }


// 2nd approach
// TIME COMPLEXITY : O(N)
// import java.util.*;
// class Solution {
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println(" ENTER THE RANGE OF THE ELEMENTS :");
//         int n= sc.nextInt();
//         int nums[]=new int[n];
//         System.out.println("ENTER THE ARRAY ELEMENTS IN 0S 1S AND 2S ONLY :");
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
        
//         int lo = 0; 
//         int hi = nums.length - 1; 
//         int mid = 0; 
//         int temp; 
//         while (mid <= hi) { 
//             switch (nums[mid]) { 
//                 case 0: { 
//                     temp = nums[lo]; 
//                     nums[lo] = nums[mid]; 
//                     nums[mid] = temp; 
//                     lo++; 
//                     mid++; 
//                     break; 
//                 } 
//                 case 1: 
//                     mid++; 
//                     break; 
//                 case 2: { 
//                     temp = nums[mid]; 
//                     nums[mid] = nums[hi]; 
//                     nums[hi] = temp; 
//                     hi--; 
//                     break; 
//                 } 
//             } 
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(nums[i]+" ");
//         }
//     }
// }
