package programs;

import java.util.ArrayList;
import java.util.List;

public class Program1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animal = new ArrayList<>();
		animal.add("Cat");
		animal.add("Dog");
		animal.add("Dear");
		System.out.println(animal);
		animal.add(2, "Elephant");
		System.out.println("Added element" + animal);

		List<String> AniBirds = new ArrayList<>(animal);

		List<String> Birds = new ArrayList<>();
		Birds.add("Peakock");
		Birds.add("Crow");

		AniBirds.addAll(Birds);
		System.out.println("combine birds and animals" + AniBirds);

	}

}
