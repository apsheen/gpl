import java.util.Scanner;

public class threeSquares
{
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		int[] numbers;
		numbers = new int[tests];

		for(int i = 0; i < tests; i++)
		{
			numbers[i] = scanner.nextInt();
		}

		int terminator = 0;

		for(int j = 0; j < tests; j++)
		{
			for(int a = 0; a < numbers[j] && terminator == 0; a++) 
			{
				for(int b = a; b < numbers[j] && terminator == 0; b++)
				{
					for(int c = b; c < numbers[j] && terminator == 0; c++)
					{
						if((a * a + b * b + c * c) == numbers[j])
						{
							System.out.println(a + " " + b + " " + c);
							terminator = 1;
						}
					}
				}
			}

			if(terminator == 0)
			{
				System.out.println("-1");
			}

			foo = 0;
		}
		
		scanner.close();
	}
}