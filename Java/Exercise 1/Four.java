
import java.util.Scanner;

public class Four {
    public static double  calculateCircumference(double r) {
        
       double circumference=2*Math.PI*r;
        return circumference;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle");
        double r = sc.nextDouble();
        double result= calculateCircumference(r);
        System.out.println(result);
    }
}
