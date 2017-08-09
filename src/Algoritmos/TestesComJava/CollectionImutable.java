package Algoritmos.TestesComJava;

import Algoritmos.TestesComJava.vo.Customer;
import Algoritmos.TestesComJava.vo.CustomerRecords;

public class CollectionImutable {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));

		// records.getCustomers().clear();

		for (Customer next : records.getCustomers().values()) {
			System.out.println(next);
		}
		
		records.addCustomer(new Customer("John2"));
		records.addCustomer(new Customer("Simon2"));
		
		for (Customer next : records.getCustomers().values()) {
			System.out.println(next);
		}
		
		
		records.getCustomers().clear();
		

	}

}
