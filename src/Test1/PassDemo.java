package Test1;

public class PassDemo {   // saved as "SumAndAverage.java"
	   public static void main (String[] args) 
	   {
	      int sum = 0;          // store the accumulated sum, init to 0
	      double average;       // average in double
	      int lowerbound = 1;   // the lower bound to sum
	      int upperbound = 100; // the upper bound to sum

	      for (int number = lowerbound; number <= upperbound; ++number) { // for loop
	         sum += number;     // same as "sum = sum + number"
	      }
	       average = sum/upperbound;
	      // Compute average in double. Beware that int/int produces int.
	      
	      // Print sum and average.
	      System.out.println(+sum);
	      System.out.println("average:" +average);
}}
	