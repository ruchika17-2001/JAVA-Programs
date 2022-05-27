public class TryDemo {
    public static void main(String[] args) {
        System.out.println("Continue :");

        for(int i =1;i<=7;i++)
        {
            if (i==6)
                continue;   // skip current interation
            System.out.println(i);    
        }
        System.out.println("\nBreak :");
        for(int j =1;j<=5;j++)
        {
            if(j==3)
                break;
            System.out.println(j);
        }
    }
}
