public class Hi implements Runnable{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        
    }
}
