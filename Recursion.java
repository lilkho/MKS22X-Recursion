import java.util.ArrayList;

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
        return sqrt(n, (n/guess + guess) / 2.0, tolerance);
    }
    public static double sqrt(double n, double tolerance){
      return sqrt(n,n,tolerance);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    private static int fib(int n, int first, int second) {
      if (n==1||n==2) return second;
      if (n<1) return 0;
      else
        return fib(n-1,second,first+second);
    }
    public static int fib(int n){
      return fib(n,1,1);
    }
    /*As Per classwork*/
    private static void makeAllSums(int n, int partial, ArrayList<Integer> sums) {
      if (n==0) sums.add(partial);
      else {
        makeAllSums(n-1,partial+n,sums);
        makeAllSums(n-1,partial,sums);
      }
    }
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> sums = new ArrayList<Integer>();
      makeAllSums(n,0,sums);
      return sums;
    }

    public static void main(String[] args) {
      System.out.println(sqrt(64,.00001));
      System.out.println(sqrt(64,.0000000001));
      for (int i=0;i<10;i++)
        System.out.println(fib(i));
      System.out.println(makeAllSums(3));
      System.out.println(makeAllSums(4));
    }
}
