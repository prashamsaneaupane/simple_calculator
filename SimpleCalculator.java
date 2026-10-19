
import java.util.Scanner;

public class SimpleCalculator {

	static Scanner kbd = new Scanner(System.in);
  
  	public static double add(double a, double b){ 
		return a+b; 
	}

	public static double subtract(double a, double b){ 
		return a-b; 
	}
	
	public static double multiply(double a, double b){ 
		return a*b; 
	}
	public static double divide(double a, double b){ 
		return a/b; 
	}

	public static void main(String[] args){

		double a = 20.0;
		double b = 4.0;

		double addResult = add(a, b);
		double subtractResult = subtract(a, b);
		double multiplyResult = multiply(a, b);
		double divideResult = divide(a, b);
		


		System.out.println("Simple Calculator ");
		System.out.println("------------------ ");
		System.out.printf("%.2f + %.2f = %.2f%n", a, b, addResult);
		System.out.printf("%.2f - %.2f = %.2f%n", a, b, subtractResult);
		System.out.printf("%.2f * %.2f = %.2f%n", a, b, multiplyResult);
		System.out.printf("%.2f / %.2f = %.2f%n", a, b, divideResult);

	}
}
