public class Nesting {
    public int largest(int a, int b)
    {
        if(a>b)
            return a;
           
        else
            return b;
    }
    public void display()
    {
        int large = largest(4,3);
        System.out.println(large + " is largest");
    }
}
