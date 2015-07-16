/** I made this program as an example to see if I'm doing what you need to be done right.
 I will make comments under each part of the program, which is made in Java using "//" or block comments for multiple line comments
 like the one I'm using right now. Single-line comments are in GREEN, while block comments are in BLUE.
 */

public class SpreadsheetSort {
	public static void main(String[] args){
	
		//Above is just information that is required to create a proper Java program
		
		String array1[] = {"894567", "Wilfred", "Ruck", "Bellerose,NY", "11426", ""}; 
		String array2[] = {"894567", "$65"};
		
		/** This array consists of strings, inputed manually by me. Arrays start at 0, therefore array1
		has 5 blocks of information labeled as 0 1 2 3 4 when it needs to be referenced.
		*/

		if (array1[0] == array2[0]) {
			// If  location 0 in array1, which is 894567, is equal to location 0 in array2, which is 894567, do what's next
			array1[5] = array2[1];
			// Location 5 in array1, which is empty, is replaced with the value in location 1 in array2, which is $65
			//System.out.println(array1[1] +" "+ array1[2] +" "+ array1[3] +" "+ array1[4] +" "+ array1[5]);
			// Print the contents of the new array1 with spaces between each value
		}
	}
}
// Result in Console at bottom.