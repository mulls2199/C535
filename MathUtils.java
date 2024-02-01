package junit5class;

public class MathUtils {
	
	public int add(int a, int b ) {
		return a + b;
	}
public int subtract(int a, int b) {
	return a - b; 
}

public int multiply(int a, int b) {
	return a*b;
}

public int divide(int a, int b) {
	if (b==0) {
		//Handle division by zero returning -1.0
		return -1;}
		
		else {
			return a /b;
		}
	
}


public static void main(String[] args) {
    MathUtils mathUtils = new MathUtils();
    
    int resultAdd = mathUtils.add(5, 3);
    System.out.println("Addition result: " + resultAdd);
    
    int resultSubtract = mathUtils.subtract(8, 2);
    System.out.println("Subtraction result: " + resultSubtract);
    
    int resultMultiply = mathUtils.multiply(4, 7);
    System.out.println("Multiplication result: " + resultMultiply);
    
    double resultDivide = mathUtils.divide(10, 2);
    System.out.println("Division result: " + resultDivide);
    
    double resultDivideByZero = mathUtils.divide(7, 0);
    System.out.println("Division by zero result: " + resultDivideByZero);
}
}