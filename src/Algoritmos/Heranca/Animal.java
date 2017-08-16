package Algoritmos.Heranca;

abstract class Animal {
	String name;

	// cool functionality
	abstract String bark();
	
	String bark2(){
		
		return "Padrao";
	};
	
}

class Dog extends Animal {
	String bark() {
		return "Bow Bow";
	}
	
}

class Cat extends Animal {
	String bark() {
		return "Meow Meow";
	}
}

