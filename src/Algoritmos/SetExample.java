package Algoritmos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("Sergio");
		set.add("Sergio");
		set.add("Cleciane");

		System.out.println(set);
		
		for (String string : set) {
			System.out.println(string);
		}
		
		
		
	}

}
