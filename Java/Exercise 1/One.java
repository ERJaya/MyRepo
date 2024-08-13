
import java.util.Scanner;

public class One {
    public static double calculateAverage(int a,int b,int c) {
        double Average=(a+b+c)/3;
        return Average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();
        
        
        double Average=calculateAverage(a, b, c);
        System.out.println("Average of given 3 numbers is:"+Average);
    }
}
