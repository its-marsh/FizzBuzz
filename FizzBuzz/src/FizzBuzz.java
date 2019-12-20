import java.util.*;

/*Write a program that prints the numbers from 1 to 100. But for multiples of three 
 *print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
 *For numbers which are multiples of both three and five print “FizzBuzz*/

public class FizzBuzz {
	
public static void main (String [] args) {
	
	List<String> fizzBuzz = new ArrayList<>();
	
	for(int i = 1; i <= 100; i++) {
		
		//check if array item is NOT divisible by 3 or 5 first, then add a number
		//possible we could use "15" here since that is a common denominator
		
		if(i%3 != 0 && i%5 != 0) {
		fizzBuzz.add(Integer.toString(i));
		}
		
		//if it is divisible by 3 or 5, we begin our "fizzbuzz" additions
		if(i%3 == 0 && i%5 ==0) {
		    fizzBuzz.add("FizzBuzz");
		}else if(i%5 == 0) {
		    fizzBuzz.add("Buzz");
		}else if(i%3 == 0) {
			fizzBuzz.add("Fizz");
		}
	    
	    System.out.println(fizzBuzz.get(i-1));
	}
	System.out.println("FizzBuzz complete.");
	
	//my first Git test comment
	
  }
}