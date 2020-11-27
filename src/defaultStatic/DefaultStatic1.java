package defaultStatic;

public class DefaultStatic1 implements IMath1, IMath2 {

	
	/*
	 * Since both interfaces have default method with same name, it must be overridden else
	 * it wont compile
	 */
	public void printSquares(int a, int b) {
		  System.out.println("**DefaultStatic1 --overridding printSquares >> " +a*a   +" ," +b*b);
	}
	
	/*
	 * Not overridding static method here. It just has same name as static method
	 */
	public void printNums(int a, int b) {
		  System.out.println("**DefaultStatic1 -- printNums instance method >> "+a +" ,"+b);
		}
		
	
	
	
	
	public static void main(String[] args) {
		
		DefaultStatic1 obj = new DefaultStatic1();
		obj.printSquares(4, 5);
		obj.printNums(3, 4); ////invoking instance method
		IMath1.printNums(5, 6);//Invoking static method
		
		

	}

}
