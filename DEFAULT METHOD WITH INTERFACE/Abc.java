@FunctionalInterface    // can have only one method
interface Abc {
    void show();
    default void display()   //default keyword allows us to define and declare  methods in interface
    {
        System.out.println("Anything....");
    }
}
