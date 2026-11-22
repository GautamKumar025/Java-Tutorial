public class PrecedenceOfOperators {
    public static void main(String[] args){

        // Write your code here!

        // Precedence & Associtivity of Operators!
        int a = 6*5-34/2;
      /*
        Highest Precedence goes to * and /.they are then evaluated on the basic of left to right associtivity
        = 30-34/2
        = 30-17
        = 13
       */ 
      
        int  b = 60/5-34*2;
        /*
        Highest Precedence goes to * and /. they are then evaluated on the basic of left to right associtivity
        = 12-34*2
        = 12-68
        = -56
        */

        System.out.println(a);
        System.out.println(b);

             
    }

}
