package programs;

import java.util.ArrayList;

public class simple_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		System.out.println("Object is: " + obj);
		/* obj.remove("B"); */
		System.out.println("Removed object " + obj.remove("B"));
		Object clonedata;
		clonedata = obj.clone();
		obj.add("E");
		System.out.println("Cloned data is: " + obj);

	}

}
