public class Array {
    public static void main(String[] args) {
        
        int num[] = {1,2,3,4,6};  // int[] num 1-D Array
        int num2[][] = {   // 2-D Array     Jagged Array - when no.of columns are not fixed
            {1,2,3},
            {3,4,5,6,7}
        };
        // num = new int[5];
        System.out.print("1-D Array\n");
        for(int k : num)
        {
            System.out.println(k + " ");
        }
        System.out.println("\n2-D Array");
        for(int l[] : num2) //first it takes 1st array
        {
            for (int i : l) //then print every element of first array
            {
             System.out.print(" " + i);
            }
            System.out.println(" ");
        }
        
    }
}
