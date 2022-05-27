public class Demo {
    public static void main(String[] args) {
        Writer w = new Pen();  //cant create object of an abstract class
        w.writing();
        w= new Pencil();
        w.writing();
    }
}
