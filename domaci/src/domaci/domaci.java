package domaci;

public class domaci {
	public static void main(String[] args) 
	{
		int a = 24;
		int b = 12;
		
		char operation = '+';
		
		if (operation == '+')
		{
			int result = a + b;
			System.out.println("a + b = " + result);
		}
		else if (operation == '-')
		{
			if (a > b)
			{
				int result = a - b;
				System.out.println("a - b = " + result);
			}
			else
			{
				int result = b - a;
				System.out.println("b - a = " + result);
			}
		}
		else if (operation == '*')
		{
			int result = a * b;
			System.out.println("a * b = " + result);
		}
		else if (operation == '/')
		{
			if (b != 0)
			{
				int result = a / b;
				System.out.println("a / b = " + result);
			}
			else
			{
				System.out.println("Greska: Deljenje sa nulom nije dozvoljeno.");
			}
		}
		else
		{
			System.out.println("Greska: Uneta je nepoznata operacija.");
		}
	}

	
}
