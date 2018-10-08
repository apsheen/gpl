import java.util.Scanner;

public class password
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.next();

		boolean trueOrFalse = false;
		char[] letters;
		letters = new char[input.length()];
		int counter = 0;
		int blanks = 0;

		for(int i = 0; i < input.length(); i++)
		{
			trueOrFalse = Character.isLetter(input.charAt(i));

			if(trueOrFalse == true)
			{
				letters[counter] = input.charAt(i);
				counter++;
            }
            
			else
			{
				blanks++;
			}
		}

		char[] backwardsLetters;
		backwardsLetters = new char[input.length() - blanks];
		int index = 0;

		for(int i = input.length() - blanks - 1; i >= 0; i--)
		{
			backwardsLetters[index] = letters[i];
			index++;
		}

		for(int i = 0; i < input.length() - blanks - 1; i++)
		{
			if(letters[i] != backwardsLetters[i])
			{
                System.out.println("NO");
                scanner.close();
				System.exit(0);
			}
		}

		System.out.println("YES");
		scanner.close();
	}
}