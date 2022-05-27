public class Tea extends Beverage {
    String bev = "Tea";
    // public void show()    // cant override final methods
    // {

    // }
    public void display()
    {
        System.out.println( bev + " is beverage...");
    }
    // finalize();
}
