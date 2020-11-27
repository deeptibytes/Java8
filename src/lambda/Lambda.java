package lambda;

public class Lambda {
	
	public int doOperation(int a, int b, ICalculation cal) {
		
		int result = cal.operate(a, b);	
		System.out.println("Result is "+result);
		return result;
	}
	
	/*
	 * Implementation 1 for abstract method
	 * Note: Return type and param list of lambda must be same as abstract method
	 * Type of the param is declared
	*/
	public void addition(int a, int b) {
	
		ICalculation addition = (int x, int y) -> x + y;
		
		doOperation(a, b, addition);
		
	}
	
	/*
	 * Implementation 2 for abstract method
	 * If we implement the interface, we can have only one implementation per class But using
	 * lamba, we can have many implementation of abstract method.
	 * Instead of returning just the number, we have return keyword mentioned under curly braces
	 */
	public void subtraction(int a, int b) {

		ICalculation subtraction = (int x, int y) -> {return x - y;};		
		doOperation(a, b, subtraction);
		
	}
	
	/* Implementation 3 for abstract method
	 * 
	 */
	public void multiply(int a, int b) {

		ICalculation multiply = (x, y) -> {
			System.out.println("Doing multiply");
			return x * y;		
		};
			
		doOperation(a, b, multiply);
		
	}
	
	/* Implementation 4 for abstract method
	 * Complex logic is enclosed under curly braces.
	 * 
	 */
	public void mod(int a, int b) {

		ICalculation mod = (x, y) -> {
			System.out.println("Doing mod");
			if(x > y) return x%y;
			else return x;		
		};
			
		doOperation(a, b, mod);
		
	}
	
	public static void main (String[] args) {
		
		Lambda obj = new Lambda();
	    obj.addition(2, 4);
	    obj.subtraction(2, 4);
	    obj.multiply(2, 4);
	    obj.mod(2, 4);
		
	}

}
