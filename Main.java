import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 List<Integer> iob = new ArrayList<>();
	       List<Double> dob = new ArrayList<>();
	       int size =5;
	       Queue<Integer> iobj=new Queue<>(iob,size);
	       Queue<Double> dobj=new Queue<>(dob,size);
	        dobj.push(1.1);
	        dobj.push(1.2);
	        dobj.push(1.3);
	        dobj.push(1.4);
	        dobj.push(1.5);
	        dobj.push(1.6);
	        dobj.push(1.7);
	        iobj.push(1);
	        dobj.pop();
	        dobj.pop();
	        iobj.display();
	        System.out.println();
	        dobj.display();
	       
	}

}
