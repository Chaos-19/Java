package com.chaos.stack;

import android.os.*;
import android.support.v7.app.*;
import android.view.*;
import android.widget.*;
import CalculatorClass;
import java.util.*;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{

	CalculatorClass cal;

	EditText input;
	TextView tv;
	String display="";
    double result=0;

	boolean clicked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		input = (EditText) findViewById(R.id.input);
		tv = (TextView) findViewById(R.id.tv);

		cal = new CalculatorClass();


		ViewGroup rootView = (ViewGroup) findViewById(android.R.id.content);
	    setClickHandlers(rootView);
    }


	private void setClickHandlers(ViewGroup rootView)
    {
    	final int childCount = rootView.getChildCount();
	    for (int i = 0; i < childCount; i++)
	    {
	        View child = rootView.getChildAt(i);

	        if (child instanceof ViewGroup)
	        {
	        	setClickHandlers((ViewGroup)child);
	        }
	        else if (child instanceof Button)
	        {
	        	child.setOnClickListener(this);
	        } 
			else if (child instanceof Button)
	        {
	        	child.setOnClickListener(this);
	        } 
	    }
    }

	@Override
	public void onClick(View p1)
	{
		switch (p1.getId())
		{
			case R.id.btn_0:
			case R.id.btn_1:
			case R.id.btn_2:
			case R.id.btn_3:
            case R.id.btn_4:
			case R.id.btn_5:
			case R.id.btn_6:
			case R.id.btn_7:
			case R.id.btn_8:
			case R.id.btn_9:
				display += (String)((Button)p1).getText();	
				input.setText(display);
				input.setSelection(input.getText().length());
				/*try
				 {

				 String[] postfix =cal.infinixToPostfixConverter(input.getText().toString());
				 result = cal.postfixCalculator(postfix);
				 tv.setText(String.valueOf(result));
				 }
				 catch (Exception e)
				 {e.printStackTrace();
				 System.out.println(e);
				 }*/
				setDisplay();
				break;
			case R.id.btn_minus:
			case R.id.btn_plus:
			case R.id.btn_divid:
			case R.id.btn_multip:
			case R.id.btn_dot:
			case R.id.btn_persent:
				tv.setText("");
				display += (String)((Button)p1).getText();
				input.setText(display);
				input.setSelection(input.getText().length());
				break;
			case R.id.Btnclear:
				display = "";
				result = 0;
				clearDisplay();
				break;
			case R.id.btn_equal:
				display = "";
				if (result != 0)
				{
					input.setText(String.valueOf(result));
					display += result;}
				tv.setText("");
		        break;
			case R.id.btn_parath:
				setParenthesis(display);
				break;
		}
		input.setSelection(input.getText().length());

	}
	public void setDisplay()
	{	
		String[] postfix =cal.infinixToPostfixConverter(input.getText().toString());
		result = cal.postfixCalculator(postfix);
		tv.setText(String.valueOf(result));
	}
	public void clearDisplay()
	{
		tv.setText("");
		input.setText("");
	}

	public void setParenthesis(String inpu)
	{

		if (cal.isDigit(input.getText().toString()))
		{
			input.setText(")");
		}
		else
			input.setText("(");
	}

}
