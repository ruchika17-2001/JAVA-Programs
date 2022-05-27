import java.lang.*;
public class Calculation {
    public static void main(String[] args) {
        double i = Math.sqrt(9.0); //takes double value
        System.out.println("Square root of is " + i );
        double b=59.5;
        double c=50;
        double d = -8.5;
        System.out.println("Sin value " + Math.sin(b));
        System.out.println("Ceil value " + Math.ceil(b)); // rounded up to whole number
        System.out.println("Floor value " + Math.floor(b));// rounded down to whole number
        System.out.println("Absolute value : " + Math.abs(d));
        System.out.println("Maximum : " + Math.max(b, c));
        System.out.println("Minimum : " + Math.min(b, c));
        int res = (9-12/3+3*2-1);   // L to R     .... Highpriority * / %   Lowpriority + -
        System.out.println(res);


    }
}
