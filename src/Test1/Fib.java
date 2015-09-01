package Test1;

public class Fib {
	   public static void main (String args[]) {
	      int n = 3;          // the index n for F(n), starting from n=3
	      int fn;             // F(n) to be computed
	      int fnMinus1 = 1;   // F(n-1), init to F(2)
	      int fnMinus2 = 1;   // F(n-2), init to F(1)
	      int nMax = 20;      // maximum n, inclusive
	      int sum = fnMinus1 + fnMinus2;
	      double average;
	 
	      System.out.println("The first " + nMax + " Fibonacci numbers are:");
	      ......
	 
	      while (n <= nMax) {
	         // Compute F(n), print it and add to sum
	         ......
	         // Adjust the index n and shift the numbers
	         ......
	      }
	 
	      // Compute and display the average (=sum/nMax)
	      ......
	   }
	}
