import java.util.*;
public class Switch {

	public static void main(String[] args) {
		
	int operator;
	double num1, num2, result;
	Scanner input = new Scanner(System.in);
	System.out.println("Choose Operator: +, -, * , or /");
	operator = input.next().charAt(0);

	System.out.println("Enter First Number");
	num1 = input.nextDouble();
	System.out.println("Enter First Number");
	num2 = input.nextDouble();
	
	switch (operator)
	{
	case '+':
		
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		break;
	
case '-':
		
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		break;
		
case '*':
	
	result = num1 + num2;
	System.out.println(num1 + " * " + num2 + " = " + result);
	break;

case '/':
		
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		break;
 default:
 System.out.println("Invalid Operator");
 break;


	}		
		
	input.close();
	
	}
}

			

