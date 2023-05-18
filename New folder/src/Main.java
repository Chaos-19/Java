import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Calculator cal = new Calculator();
		int choice =0;//in.nextInt();
		while (choice != 3)
		{
	System.out.println("enter you choice");		
			 choice =in.nextInt();

			if (choice == 2)
			{
				String data=in.next();
//System.out.println("my  : " + Arrays.toString(cal.postfix("80*(3*2)/3-9")));
				String[] post =cal.postfix(data);


				System.out.println("\n\n\n\n\n\n\n");
				System.out.println("result  " + cal.calculate(post));
			}
		}
	}
}
