import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Calculator
{
	//ArrayList<String> out = new ArrayList<>();
	public static int size =-1;

	public boolean isDigit(String in)
	{
		try
		{
			Double.valueOf(in);
			return true;
		}
		catch (NumberFormatException e)
		{}

		return false;
	}


	public int precedence(String opra)
	{
		char n=opra.charAt(0);
		if (n == '+' || n == '-')
			return 1;
		else if (n == '×' || n == '÷')
			return 2;
		else if (n == '^')
			return 3;
		return -1;	
	}

	public String[] postfix(String infinx)
	{
		//int size =-1;
		Stack<String> stack = new Stack<String>();
		Pattern pattern = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([\\^\\+\\-\\×/\\(÷)]))");
		String out[] = new String[infinx.length()];
		Matcher m = pattern.matcher(infinx);
		while (m.find())
		{
			String n = m.group();
			if (isDigit(n))
			{
				out[++size] = n;
			}
			else if ("(".equals(n))
			{
				stack.push(n);			
			}
			else if (")".equals(n))
			{	
				while (!stack.isEmpty() && !"(".equals(stack.peek()))
				{
					out[++size] = stack.peek();
					stack.pop();
				}
				stack.pop();
			}
			else
			{
				if (!stack.isEmpty())
				{
					while (!stack.isEmpty() && precedence(n) <= precedence((String)stack.peek()))
					{
						out[++size] = stack.peek();
						stack.pop();
					}
				}

				stack.push(n);
			}
		}



		while (!stack.isEmpty())
		{
			out[++size] = stack.peek();
			stack.pop();
		}

		return out;}

	public double calculate(String out[])
	{
		Stack<Double> stack2 =new Stack<Double>();
		for (int i = 0; i <= size; i++)
		{
			String v = out[i];
			if (isDigit(v))
			{
				stack2.push(Double.valueOf(v));

			}
			else
			{
				if (!stack2.isEmpty())
				{
					double x =(Double) stack2.peek();
					stack2.pop();
					double y =(Double) stack2.peek();
					stack2.pop();
					switch (v)
					{
						case "+":
							stack2.push(y + x);
							break;
						case "-":
							stack2.push(y - x);
							break;
						case "×":
							stack2.push(y * x);
							break;
						case "÷":
							stack2.push(y / x);
							break;
						case "^":
							stack2.push(Math.pow(y, x));
							break;
					}
				}
			}
		}
size=-1;
		return  (Double) stack2.pop();
	}

}
