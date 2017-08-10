package Algoritmos.TestesComJava.vo;

public class Customer {
	
	public Customer(String name) {
		this.name = name;
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}
	
	public void finalize(){
		System.out.println("Object is being gc'd.");
		
		
	}
	
}
