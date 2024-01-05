package h;

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

	        return count;
	    }
	}



