package forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	
	public List<Integer> createList() {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		return myList;
	}
	
	public void modifyListElements(List<Integer> list, Consumer<Integer> consumer) {
		
		list.forEach(consumer);
		
	}
	
   public void modifyListElements(List<Integer> list, boolean val) {
		
	    Consumer<Integer> consumer = (Integer n) -> {
	    	  if(val) System.out.println("Printing as is "+n);
	    	  else
	    		  System.out.println("Printing square "+n*n);
	    };
		list.forEach(consumer);
		
		
	}
	
	
	public static void main(String[] args) {
		ForEach obj = new ForEach();		
		List<Integer> list =  obj.createList();
		obj.modifyListElements(list, false);
		
		

	}

}
