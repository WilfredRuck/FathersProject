import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalSpreadSheet {
		public static void main(String[] args) throws FileNotFoundException {
			//Above is just information that is required to create a proper Java program
			
			String[] numbers = readArray("IDs.txt"); // 4241 in array
			String[] numberCheck = readArray2("IDs2.txt"); // 251 in array
			String[] zipCodes = readArray3("ZipCodes.txt"); // 4241 in array
			int count = 0;
			for (int i = 0; i < numbers.length; i++) {
				for(int j = 0; j < numberCheck.length; j++) {
					
					if(numbers[i].equals(numberCheck[j])){ // If a number in the list from numbers array is equal to a number in the list in the numberCheck array
						count++;
						System.out.println("Found a match! ID: "+ numberCheck[j] +" "+"ZipCode: "+ zipCodes[j]); //print the number from numberCheck and add the zipcode.
					}
				}
			}
				if(count == 0){
					System.out.println("Met no match"); //if there are no matches, print "Met no match"
				}
				else{
					System.out.println("I found"+" "+count+" "+"matches!"); //otherwise, if there were matches, print how many you found!
				}
		}
		//end of main
		//}		
			/*
			 * This method will take a string parameter and
			 *  copy the contents into an array of strings.	
			 *  @param String file
			 *  @return String[]
			 */

			public static String[] readArray(String file) {
				/*
				 * Step 1:
				 * Count how many elements(lines) are in the file "IDs.txt".
				 * Step 2:
				 * Create the array and copy the elements in.
				 */
				int ctr = 0; //counter
				try{
					Scanner s1 = new Scanner(new File(file));
				
					while (s1.hasNextLine()){
						ctr = ctr + 1;
						s1.nextLine();
					}
					String[] numbers = new String[ctr];
				
					Scanner s2 = new Scanner(new File(file));
					for (int i = 0; i < ctr; i = i + 1) {
						numbers[i] = s2.next();
					}
					
				return numbers;
			}
				catch (FileNotFoundException e){
					
				}
			return null;
			}
			
			//End of ID check
			
			private static String[] readArray2(String file) {
					/*
					 * Step 1:
					 * Count how many elements(lines) are in the file "Ids2.txt".
					 * Step 2:
					 * Create the array and copy the elements in.
					 */
					int ctr = 0; //counter
					try{
						Scanner s1 = new Scanner(new File(file));
					
						while (s1.hasNextLine()){
							ctr = ctr + 1;
							s1.nextLine();
						}
						String[] numberCheck = new String[ctr];
					
						Scanner s2 = new Scanner(new File(file));
						for (int i = 0; i < ctr; i = i + 1) {
							numberCheck[i] = s2.next();
						}
						
						return numberCheck;
					}
					catch (FileNotFoundException e){
						
					}				
			return null;
			}
			// End of numberCheck

		private static String[] readArray3(String string) {
			/*
			 * Step 1:
			 * Count how many elements(lines) are in the file"ZipCodes.txt".
			 * Step 2:
			 * Create the array and copy the elements in.
			 */
			int ctr = 0; //counter
			try{
				Scanner s1 = new Scanner(new File(string));
			
				while (s1.hasNextLine()){
					ctr = ctr + 1;
					s1.nextLine();
				}
				String[] zipCodes = new String[ctr];
			
				Scanner s2 = new Scanner(new File(string));
				for (int i = 0; i < ctr; i = i + 1) {
					zipCodes[i] = s2.next();
				}
				
				return zipCodes;
			}
			catch (FileNotFoundException e){
				
			}				
	return null;
	}
}
			
