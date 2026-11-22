import java.util.Scanner;
public class QuickQuiz02 {
    int max = 100;
    int obtd;


    public static void main(String[] args){

        // write your code here!

        QuickQuiz02 s1 = new QuickQuiz02();
        System.out.print("Enter Maths Marks : ");
        Scanner sc = new Scanner(System.in);
        s1.obtd = sc.nextInt();

        QuickQuiz02 s2 = new QuickQuiz02();
        System.out.print("Enter Physic Marks : ");
        s2.obtd = sc.nextInt();

        QuickQuiz02 s3 = new QuickQuiz02();
        System.out.print("Enter Chemistry Marks : ");
        s3.obtd = sc.nextInt();

        QuickQuiz02 s4 = new QuickQuiz02();
        System.out.print("Enter English Marks : ");
        s4.obtd = sc.nextInt();

        QuickQuiz02 s5 = new QuickQuiz02();
        System.out.print("Enter Hindi Marks : ");
        s5.obtd = sc.nextInt();

        int tobtd = (s1.obtd) + (s2.obtd) + (s3.obtd) + (s4.obtd) + (s5.obtd);
        int per = (tobtd * 100 / 500);
        System.out.print("Percentage obtained : " + per);

        sc.close();

    }

}
