package Algoritmos.DesignPatterns.Creational;

//O padrão Singleton permite criar objetos únicos para os quais há apenas uma instância. 
//Este padrão oferece um ponto de acesso global, assim como uma variável global, porém sem as desvantagens das variáveis globais

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

