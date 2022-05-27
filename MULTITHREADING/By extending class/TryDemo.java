public class TryDemo {
    public static void main(String[] args) {
        // Thread t1 = new Thread();
        // t1.run();
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        obj1.start();  //it calls run method
        obj2.start();
    }
}
