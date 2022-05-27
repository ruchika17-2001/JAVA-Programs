class ExceptionDemo
{
    public static void main(String[] args) {
        try{
            int i= 7;     // execute if exception not occur
            int j = 0;
            int k = i/j;   //throws exception when having critical statements 
            System.out.println("Output is " + k);
        }
        catch(Exception e)
        {
            System.err.print("Error!! "); // execute if exeception occurs
        }s
        finally
        {
            System.out.println("Program stopped.."); //execute no matter exception occurs or not
        }
    }
}