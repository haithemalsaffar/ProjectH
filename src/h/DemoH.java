package h;
//	method iterates through the input string and checks each pair of consecutive characters.
//	If the pair is equal to "hi," it increments the count.
//	The method returns the total count of occurrences of "hi" in the given string.
public class DemoH {
	
	    public static void main(String[] args) {
	        System.out.println(countHi("ABC hi ho"));   // Output: 1
	        System.out.println(countHi("ABChi hi"));    // Output: 2
	        System.out.println(countHi("hihi"));        // Output: 2
	    }

	    static int countHi(String input) {
	        int count = 0;

	        // Iterate through the input string
	        for (int i = 0; i < input.length() - 1; i++) {
	            // Check for the occurrence of "hi"
	            if (input.substring(i, i + 2).equals("hi")) {
	                count++;
	            }
	        }
		    // comment to test the github

	        return count;
	    }
	}



