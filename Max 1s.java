
class Max1s
{
    public static void main(String args[])
    {
        int a[][]= {{0,0,0,1},
                    {1,1,1,1},
                    {0,1,1,1},
                    {0,0,1,1}};
        
        for(int i =0;i<4;i++,System.out.println())
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
        int count=0;
        for(int i=0;i<4;i++)
        {
            count=0;
            for(int j=3;j>=0;j--)
            {
                
                if(a[i][j]==1)
                {
                    count++;
                }
                
            }
            System.out.println(" MAX 1S IN "+i+"th row :"+count);
            
        }
    }
}

            
    

