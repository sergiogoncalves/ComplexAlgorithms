package Algoritmos.DesignPatterns;



public class Singleton {
	static class SingletonPattern {
		
		private static Singleton instance = new Singleton();

		private SingletonPattern() {
		}

		public static Singleton getSingleInstance() {
			return instance;
		}

	}
}

