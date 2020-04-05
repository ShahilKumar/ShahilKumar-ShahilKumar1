import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		       List<Integer> iob = new ArrayList<>();
		       List<Double> ob = new ArrayList<>();
		       int size =5;
		       Stack<Integer> iobj=new Stack<>(iob,size);
		       Stack<Double> obj=new Stack<>(ob,size);
		        obj.push(1.1);
		        obj.push(1.2);
		        obj.push(1.3);
		        obj.push(1.4);
		        obj.push(1.5);
		        //obj.push(1.6);
		        //obj.push(1.7);
		       // System.out.println("======");
		        //obj.pop();
		        //System.out.println("======");
		        
		        iobj.display();
		       
	
	}
}
