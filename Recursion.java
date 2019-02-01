public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    private static double sqrt(double n, double guess, double tolerance) {
      if (Math.abs((guess*guess-n)/(n)) <= tolerance)
        return guess;
      else
        return sqrt(n, (n/guess + guess) / 2.0);
    }
    public static double sqrt(double n, double tolerance){
      return sqrt(n,n,tolerance);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     /
    private static int fib(int n, int first, int second) {
      if (n==1||n==2) return 1;
      if (n<1) return 0;
      else
        return fib(first+second,n-1,n-2);
    }
    public static int fib(int n){

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){

    }

    public static void main(String[] args) {

    }

}
