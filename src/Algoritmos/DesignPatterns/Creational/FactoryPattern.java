package Algoritmos.DesignPatterns.Creational;


//De forma geral todos os padrões Factory (Simple Factory, Factory Method, Abstract Factory) 
//encapsulam a criação de objetos. O padrão Factory Method por sua vez encapsula a criação de objetos, 
//no entanto, a diferença é que neste padrão encapsula-se a criação de objetos deixando as subclasses decidirem quais objetos criar.

public abstract class Pessoa {

	public String nome;
	public String sexo;

}

class Homem extends Pessoa {
	
	public Homem(String nome) {
		this.nome = nome;
		System.out.println("Olá Senhor " + this.nome);
	}
}

class Mulher extends Pessoa {
	
	public Mulher(String nome) {
		this.nome = nome;
		System.out.println("Olá Senhora " + this.nome);
	}

}
/////CHAMADA DA CLASSE
class FactoryPessoa {

	public Pessoa getPessoa(String nome, String sexo) {
		if (sexo.equals("M"))
			return new Homem(nome);
		if (sexo.equals("F"))
			return new Mulher(nome);
		return null;
	}

}