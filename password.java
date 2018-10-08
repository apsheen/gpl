import java.util.Scanner;

public class password
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); //open input stream
        String input;
        input = scanner.next(); //string to check if palindrome

		boolean bool = false; //for checking if character is alpha
		char[] letters; //array for all alpha characters
		letters = new char[input.length()];
		int counter = 0;
		int blanks = 0;

		for(int i = 0; i < input.length(); i++) //parse input
		{
			bool = Character.isLetter(input.charAt(i));

			if(bool == true)
			{
				letters[counter] = input.charAt(i);
				counter++;
            }
            
			else
			{
				blanks++;
			}
		}

		char[] backwardsLetters; //array for backwards arrangement
		backwardsLetters = new char[input.length() - blanks];
		int index = 0;

		for(int i = input.length() - blanks - 1; i >= 0; i--) //fill array
		{
			backwardsLetters[index] = letters[i];
			index++;
		}

		for(int i = 0; i < input.length() - blanks - 1; i++) //check if arrays are same - palindrome
		{
			if(letters[i] != backwardsLetters[i])
			{
                System.out.println("NO");
                scanner.close();
				System.exit(0);
			}
		}

		System.out.println("YES");
		scanner.close(); //close input stream
	}
}