import java.util.Scanner;

public class ProblemNo04 {
    public static void main(String[] args){

        // Write your code here!

        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            System.out.println("You entered : " + number);
        }else{
            System.out.println("Invalid input. please enter a valid integer.");
        }
    }
}
