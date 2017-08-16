package Algoritmos.Interfaces;

//Representa os contratos de ações em comum
		interface Flyable {
			void fly();
		}

		class Aeroplane implements Flyable {
			public void fly() {
				System.out.println("Aeroplane is flying");
			}
		}

		class Bird implements Flyable {
			public void fly() {
				System.out.println("Bird is flying");
			}
		}

