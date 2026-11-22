import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args){

        // write your code here!

        System.out.println("Taking Input from the user!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        

        System.out.println("Enter number 2");
        int b = sc.nextInt();
        System.out.print("The sum of Two number is : ");
        int sum = a + b;
        System.out.println(sum);
       

    }
}
