
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Positive=0;
        int Negative=0;
        int Zero=0;
        System.out.println("Enter numbers upto you want:(Press 0 to stop)");
       
        while (true) { 
            int number = sc.nextInt();
        if(number>0){
            System.out.println("Number is Positive");
            Positive++;
        } else if(number<0){
            System.out.println("Number is Negative");
            Negative++;
        } else{
            System.out.println("Number is Zero");
            Zero++;
            if(number==0){
                break ;
            }
        }
    }

    
   System.out.println("Positive number Entered="+Positive);
   System.out.println("Negative number Entered="+Negative);
   System.out.println("Zero number Entered="+Zero);
    }
}
