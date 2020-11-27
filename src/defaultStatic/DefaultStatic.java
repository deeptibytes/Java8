package defaultStatic;

public class DefaultStatic implements IMath1{

	
	
	public static void main(String[] args) {
		DefaultStatic obj = new DefaultStatic();
	 /*
	  * calling default method. No overriding is required. Default
	  * implementation from interface is invoked
	  */
		obj.printSquares(4, 5);
		
	}

}
