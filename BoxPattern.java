class BoxPattern
{
    public static void main(String[] args) {
      
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            { 
                if(i==1 || j==1 || i==4 || j==4)
                    System.out.print("$ ");
                else
                    System.out.print("  ");   
            }
            // for(int m=1;m<=2;m++)
            // {
            //     System.out.print("$ ");
            // }
            // for(int k=1;k<=3;k++)
            // {
            //     System.out.print("$ ");
            // }
            System.out.println();
        }
    }
}