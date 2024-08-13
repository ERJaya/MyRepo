
import java.util.Scanner;

public class Five {
    public static void elgibleVoting(int age) {
        if(age>=18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        elgibleVoting(age);
    }
}
