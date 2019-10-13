package practice;
import java.util.Scanner;

public class calculator
{
	public static void main (String[] args)
	{
		int num1,num2;
		String operation;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the num1:");
		num1 = input.nextInt();
		System.out.println("Enter the num2:");
		num2 = input.nextInt();
		Scanner op = new Scanner(System.in);
		System.out.println("Please enter operation");
		operation = op.next();
		if(operation == "+")
		{
			System.out.println("Your addition is :"+ (num1+num2));
		}
		else if(operation == "-")
		{
			System.out.println("Your subtraction is :"+ (num1-num2));
		}
		else if(operation == "*")
		{
			System.out.println("Your multiplication is :"+ (num1*num2));
		}
		else if(operation == "/")
		{
			System.out.println("Your division is :"+ (num1/num2));
			if(num2 == 0)
			{
				System.out.println("Invalid input");
			}
		}
	}
	
}
