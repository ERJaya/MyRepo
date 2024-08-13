
import java.util.Scanner;

public class Three {
    public static int  calculateGreater(int a, int b) {
        if(a>b){
            System.out.println("A is Greater");
        }
        else{
            System.out.println("B is Greater");
        }
        return b ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b= sc.nextInt();
        System.out.println(calculateGreater(a, b));
    }
}
