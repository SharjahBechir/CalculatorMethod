import java.util.Scanner;
public class CalculatorMethod {
	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);
		int a,b,sum,product,difference;
		double quotient;

    	System.out.println("Enter first no:");
		a=sc.nextInt();
    	System.out.println("Enter second no:");
		b=sc.nextInt();

		System.out.println("The sum of " + a + " and " + b + " is: " + computeSum(a,b));
    	System.out.println("The product of " + a +  " and "  + b +  " is: " + computeProduct(a,b));
    	System.out.println("The difference of " + a +  " and "  + b +  " is: " + computeDifference(a,b));
    	System.out.println("The quotient of " + a +  " and " + b + " is: " + computeQuotient(a,b));

	}


	public static int computeSum(int a, int b){
		 return a+b;
	}
	public static int computeProduct(int a, int b){
		 return a*b;
	}
	public static int computeDifference(int a, int b){
		 return a-b;
	}
	public static double computeQuotient(int a, int b){
		 return (double)a/(double)b;
	}
}