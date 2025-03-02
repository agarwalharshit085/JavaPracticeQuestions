import java.util.*;
class Search2D
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE DIMENSIONS OF THE MATRIX");
        int row=sc.nextInt();
        int col= sc.nextInt();
        int matrix[][]=new int[row][col];
        System.out.println(" PLEASE ENTER THE ELEMENTS OF THE MATRIX IN ASCENDING ORDER");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered the matrix in ASCENDING ORDER :");
        for(int i=0;i<row;i++,System.out.println())
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
        int el=sc.nextInt();
        int i =0;
        int j=col-1;
        while(i<row && j>=0)
        {
            if(matrix[i][j]==el)
            {
                System.out.println("Found element in : "+i+" row and : "+j+" column");
            }
            if(matrix[i][j]>el)
            {
                j--;
            }
            else{
                i++;
            }
        }
    }
}