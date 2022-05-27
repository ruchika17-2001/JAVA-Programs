
public class Demo {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner();   //simple inner class
        obj1.display();
        Outer.InnerClass obj2 = new Outer.InnerClass();   //Static inner class
        obj2.disp();

    }
}
