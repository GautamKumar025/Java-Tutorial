import java.util.Scanner;

public class QuickQuiz03 {
    public static void main(String[] args){

        // write your code here!

        System.out.print("Convert kilometer to millimeter! : ");
        Scanner sc = new Scanner(System.in);
        double kilometer = sc.nextDouble();

        double millimeter = kilometer * 1000000;
        System.out.println("Distance in millimeter = " + millimeter);

        sc.close();
    }
}
