public class LogicalOperators {
    public static void main(String[] args){

        // Write your code here!

        System.out.println("Performe The Logical Operators!:");
        int a = 15;
        int b = 10;

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println();

        // logical operator AND(&&)
        System.out.println("(a > b) && (a != b) : " + ((a > b) &&(a != b)));

        // logical operator OR(||)
        System.out.println("(a < b) || (a == b) : " + ((a < b) || (a == b)));

        // logical operator NOT(!)
        System.out.println("(a > b) : " + !(a > b));

        
// Explanation!
// 1. &&(logical AND): Returns true only if both conditions are true.
// 2.||(logical OR): Returns true if at least one conditions is true. 
// 3.!(logical NOT): Reverses the boolean (value(true becomes false, and false becomes true)


      

    }
}
