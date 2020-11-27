package defaultStatic;

public interface IMath1 {
	
	
	/*
	 * Cant be overridden!! only visible to this Interface
	 */
	static void printNums(int a, int b) {
	  System.out.println("**IMath1 -- printNums static method>> "+a +" ,"+b);
	}
	
	
	/*
	 * If this method is not overridden, default behavior is given here
	 */
	default void printSquares(int a, int b) {
		  System.out.println("**IMath1 --printSquares >> " +a*a   +" ," +b*b);
	}
	
	

}
