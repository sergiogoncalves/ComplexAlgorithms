package Algoritmos.TestesComJava;

import Algoritmos.TestesComJava.vo.Customer;

public class GarbageCollector {

	public GarbageCollector() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		Runtime runtime = Runtime.getRuntime();

		long availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");

		// let's create a ton of garbage....
		Customer c;
		for (int i=0; i<1000000000; i++)
		{
			c = new Customer("John");	
		}
		
		availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");
		
		System.gc();
		
		availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");
	}

}
