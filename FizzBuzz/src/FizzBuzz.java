import java.util.*;

/*Write a program that prints the numbers from 1 to 100. But for multiples of three 
 *print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
 *For numbers which are multiples of both three and five print “FizzBuzz*/

public class FizzBuzz {
	
public static void main (String[] args) {
	
	List<String> fizzBuzz = new ArrayList<>();
	
	for(int i = 1; i <= 100; i++) {
		//go through each element and check if divisible by 3 AND 5 first
		if((i % 3 == 0) && (i % 5 == 0)) {
		    fizzBuzz.add("FizzBuzz");
		//check if divisible by 5 next
		} else if(i % 5 == 0) {
		    fizzBuzz.add("Buzz");
		//check if divisible by 3 next
		} else if(i % 3 == 0) {
			fizzBuzz.add("Fizz");
		//everything else displayed as normal
		} else {
			fizzBuzz.add(Integer.toString(i));
		}
	    System.out.println(fizzBuzz.get(i - 1));
	}
	System.out.println("FizzBuzz complete.");
	
	//my first Git test comment
	
  }
}