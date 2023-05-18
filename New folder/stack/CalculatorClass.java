import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class CalculatorClass
{
	//ArrayList<String> out = new ArrayList<>();
	public static int infinxSize =-1;

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

	public String[] infinixToPostfixConverter(String infinxExpression)
	{
		Stack<String> stack = new Stack<String>();
		Pattern pattern = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([\\^\\+\\-\\×/\\(÷)]))");
		String postfixExpression[] = new String[infinxExpression.length()];
		Matcher m = pattern.matcher(infinxExpression);
		while (m.find())
		{
			String n = m.group();
			if (isDigit(n))
			{
				postfixExpression[++infinxSize] = n;
			}
			else if ("(".equals(n))
			{
				stack.push(n);			
			}
			else if (")".equals(n))
			{	
				while (!stack.isEmpty() && !"(".equals(stack.peek()))
				{
					postfixExpression[++infinxSize] = stack.peek();
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
						postfixExpression[++infinxSize] = stack.peek();
						stack.pop();
					}
				}

				stack.push(n);
			}
		}



		while (!stack.isEmpty())
		{
			postfixExpression[++infinxSize] = stack.peek();
			stack.pop();
		}

		return postfixExpression;}

	public double postfixCalculator(String postfixExpression[])
	{
		Stack<Double> stack =new Stack<Double>();
		for (int i = 0; i <= infinxSize; i++)
		{
			String v = postfixExpression[i];
			if (isDigit(v))
			{
				stack.push(Double.valueOf(v));

			}
			else
			{
				if (!stack.isEmpty())
				{
					double x =(Double) stack.peek();
					stack.pop();
					double y =(Double) stack.peek();
					stack.pop();
					switch (v)
					{
						case "+":
							stack.push(y + x);
							break;
						case "-":
							stack.push(y - x);
							break;
						case "×":
							stack.push(y * x);
							break;
						case "÷":
							stack.push(y / x);
							break;
						case "^":
							stack.push(Math.pow(y, x));
							break;
					}
				}
			}
		}
		infinxSize = -1;
		return  (Double) stack.pop();
	}

}
