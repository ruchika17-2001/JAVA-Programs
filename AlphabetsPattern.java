class AlphabetsPattern
{
    public static void main(String[] args) {
        char a = 97 ;
        for(int i=0;i<=6;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char) (a + j) + " ");
            }
            System.out.println();
        }
    }
}