public class Demo {
    //compile time and run time polymorphism
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.show();

        obj1 = new C();
        obj1.show(); //Dynamic Method Dispatch
    }
}
