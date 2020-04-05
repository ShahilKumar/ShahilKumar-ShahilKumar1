import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
	 List<T> ob = new ArrayList<T>();
	    int totalSize;
	   	    
	    public Queue( List<T> array,int s){
	        ob = array;
	        totalSize = s;
	     }
	    
	    public void push(T data) {
	    	if(ob.size()==totalSize)
	    		System.out.println("Queue Full");
	    	else {
	    		ob.add(data);
	     	}   		
	    	
	    }
	    
	    public void pop() {
	    	 if(ob.isEmpty()){
		            System.out.println("No data to delete");
		        }
	    	 else {
	    		 T b = ob.remove(0);
	    		 System.out.println("popped element =" + b);
	    	 }
	    		 
	    }
	    
	    public void display() {
	    	 if(ob.isEmpty()) {
	    		 System.out.println("No data");
	    	 }
	    	 else {
	    		 for(int i = 0; i <= ob.size()-1 ; i++)
	    			 System.out.println(ob.get(i));
	    	 }
	    	
	    }
}
