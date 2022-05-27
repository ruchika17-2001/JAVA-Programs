public class Operation {
    public static void main(String[] args) {
        int a =10, b =40;
        int res1 = a++ + ++a + ++a;
        int res2 = --b + b-- + b--; //39 + 39 + 38 
        System.out.println(" Incremented value : " + res1);
        System.out.println(" Decremented value : " + res2);

    }
}
