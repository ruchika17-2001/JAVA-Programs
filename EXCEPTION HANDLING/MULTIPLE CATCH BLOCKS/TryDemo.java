public class TryDemo {
    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            arr[3] = 3;
            int i = 2, j = 0;
            int res = i/j;    //throws exception
            System.out.println("Array is " + arr[3]);
            System.out.println("Result is " + res);
        }
        // catch(ArithmeticException e)     
        // {
        //     System.out.println("Cannot divide by 0.");  // this will be executed here
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("Out of array index.");
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Something went wrong !!");  // when we dont know which exception is there, use only "Exception" in last catch block
        // }
        //we can also write above catch blocks as 
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Something went wrong !!");
        }
        finally{
             System.out.println("we have executed the program.");
        }
    }
}
