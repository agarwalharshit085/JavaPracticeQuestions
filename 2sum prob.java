//  Time complexity O(N LOG N) where  space complexity O(N) . 
//  Two Sum : Check if a pair with given sum exists in Array.

// import java.util.*;
// import java.util.Arrays;
// class Sum2
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner (System.in);
//         System.out.println(" ENTER THE  TARGET SUM : ");
//         int target= sc.nextInt();
//         int a[]={2,7,11,15,3,1,4};
//         Arrays.sort(a);
//         for(int i=0; i<a.length; i++){
//             System.out.println(" " + a[i]);
//         }
//         int low=0;
//         int high=a.length-1,n1=0,n2=0;
//         while(low<=high)
//         {
//             if(a[low]+a[high]==target)
//             {
//                 n1=a[low];
//                 n2=a[high];
//                 break;
//             }
//             else if(a[low]+a[high]>target)
//             {
//                 high--;
//             }
//             else{
//                 low++;
//             }
//         }
//         for(int i=0; i<a.length; i++){
//             if(a[i]==n1)
//             {
//                 System.out.println(i);
//             }
//             else if(a[i]==n2)
//             {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// TIME COMPLEXITY =SPACE COMPLEXITY = O(N)
// USING HASH MAP
// import java.util.HashMap;
// import java.util.*;
// class Solution
// {
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("ENTER THE TARGET SUM :");
//         int target=sc.nextInt();
//         int numbers[]={1,2,3,4,5,6,7,8,9,};
//         int[] result = new int[2];
//         Map <Integer,Integer> map=new HashMap<Integer,Integer>();
//         for(int i=0;i<numbers.length;i++)
//         {
//             if(map.containsKey(target-numbers[i]))
//             {
//                 result[1]=i;
//                 result[0]=map.get(target-numbers[i]);
                
//             }
//             map.put(numbers[i],i);
//         }
//         for(int i=0;i<result.length;i++)
//         {
//             System.out.println(result[i]+" ");
//         }
//     }
// }


// Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.



//User function Template for Java

// import java.util.ArrayList;
// class pair  {  
//     long first, second;  
//     public pair(long first, long second)  
//     {  
//         this.first = first;  
//         this.second = second;  
//     }  
// }


// class Solution {
//     public pair[] allPairs( long A[], long B[], long N, long M, long X) {
//         // Your code goes here
//         Arrays.sort(A);
//         Arrays.sort(B);
        
//         ArrayList<pair> list =new ArrayList<>();
//         int i=0,j=B.length-1;
        
//         while(i<N && j>=0){
//             long sum=A[i]+B[j];
//             if(sum==X){
//                 pair p =new pair(A[i],B[j]);
//                 list.add(p);
//                 i++; j--;
//             }else if(sum<X) i++;
//             else j--;
//         }
//         pair arr[]=new pair[list.size()];
//         arr=list.toArray(arr);
//         return arr;
//     }
// }