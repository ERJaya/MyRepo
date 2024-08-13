
import java.util.Scanner;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 : System.out.println("Hello");
               break;
               case 2:System.out.println("Namaste");
               break;
               case 3 : System.out.println("Pranam");
               break;
            default:
              System.out.println("Invalid choice");
        }
    }
}
