package defaultStatic;

public interface IMath2 {
	
	
	
	
	
	default void printSquares(int a, int b) {
		  System.out.println("**IMath1 --printSquares >> " +a*a   +" ," +b*b);
	}
	

}
