package stringsort;
	
import java.util.Scanner; //Importing Scanner Class

/**
 * Class to sort words of given string, then sort characters in each word
 * @author Praveen
 */
public class StringSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); //Creating object of Scanner Class to take user strInput
		System.out.print("Please enter a String to sort its words and characters of each word: ");
		
		String strInput = scan.nextLine();// Initialising String strInput with the user input
		
		scan.close();//Closing Scanner object
		
		strInput = strInput + " "; // Adding a space at end of strInput String
		
		
		
		// Finding the number of words by searching for a whitespace and getting the words
		int numberOfWords = 0;
		for (int i = 0; i < strInput.length(); i++) 
		{
			char ch = strInput.charAt(i);
			if (ch == ' ') 
			{
				numberOfWords++;
			}
		}
		
		
		
		// Extracting the words and storing in array
		String[] wordList = new String[numberOfWords];
		int startIndex = 0;  
		int currentWordIndex = 0;
		for (int i = 0; i < strInput.length(); i++) 
		{
			char ch = strInput.charAt(i);
			if (ch == ' ') 
			{
				String word = strInput.substring(startIndex, i);
				startIndex = i + 1;
				wordList[currentWordIndex] = word;
				currentWordIndex++;
			}
		}
		
		
		
		// Sort words of the given strings
		for (int k = 0; k < wordList.length - 1; k++) 
		{
			for (int l = k+1; l < wordList.length ; l++) 
			{
				if (wordList[l].compareTo(wordList[k])<0) 
				{
					String tempStr = wordList[k];
					wordList[k] = wordList[l];
					wordList[l] = tempStr;
				}
			}
		}
		
		
		
		// Printing the sorted words of the string
		System.out.println("\nPrinting the string after sorting the words: ");
		for (int j = 0; j < wordList.length; j++) 
		{
			System.out.print(wordList[j] + " ");
		}
		System.out.println();

		
		
		//Sorting the characters of each of the sorted word in the wordList array
		System.out.println("\nSorted characters of each sorted word in the string;");
		
		for(int i=0; i < wordList.length; i++)
		{            
			// Creating a character array for every word
			char[] charArray = wordList[i].toCharArray(); 
			
			//Sorting the characters in the character array
			for(int j=0;j<(charArray.length);j++)
			{
				for(int k=j+1;k<(charArray.length);k++)
				{
					if(charArray[k]<charArray[j])
					{
						char temp=charArray[j];
						charArray[j]=charArray[k];
						charArray[k]=temp;
					}
				}

			}

			String sortedString="";

			// Creating the final sorted string where both words and characters in them are sorted
			for(int l=0;l<charArray.length;l++)
			{
				sortedString = sortedString + charArray[l];
			} 
			
			System.out.print(sortedString + " "); // Printing the final sorted string

 		}		
	}
}
 

 