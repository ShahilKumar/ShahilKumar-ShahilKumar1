import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	    
	    List<T> ob = new ArrayList<T>();
	    int totalSize;
	    
	    public Stack( List<T> array,int s){
	        ob = array;
	        //System.out.println(ob.size());
	        totalSize = s;
	    }
	    public void push(T data){
	        if(ob.size()==totalSize){
	            System.out.println("Stack is full");
	        }
	        else{
	            
	            ob.add(data);
	            
	        }
	    }
	    public void  pop(){
	        if(ob.isEmpty()){
	            System.out.println("No data to delete");
	        }
	        else{
	           
	            T b = ob.remove(ob.size()-1);
	            System.out.println(b);
	         }
	    }
	    
	   
	    
	    public void display(){
	    	 if(ob.isEmpty()) {
	    		 System.out.println("No data");
	    	 }
	    	 else {
	        for(int i=ob.size()-1;i>=0;i--){
	            System.out.println(ob.get(i));
	        }
	        }	        
	    }
	}


