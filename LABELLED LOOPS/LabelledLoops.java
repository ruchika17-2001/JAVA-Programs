public class LabelledLoops {
    public static void main(String[] args) {
        System.out.println("Labelled continue :");
        outer : for(int i=1;i<=2;i++)
        {
           for(int j=1;j<=5;j++)
           {
               if(j==4)
                continue outer;   // labelled continue
               System.out.println("value :" + j);
           }
           System.out.println(" ");
        }
        System.out.println("Labelled break :");
        inner : for(int k=1;k<=2;k++)
        {
           for(int m=1;m<=5;m++)
           {
               if(k==2)
                break inner;   // labelled continue
               System.out.println("value :" + m);
           }
           System.out.println(" ");
        }

    }
}
