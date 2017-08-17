package Algoritmos.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Implementacao {

	public LinkedList_Implementacao() {
		// TODO Auto-generated constructor stub
	}
	
	//Implements Queue collection
	//Every node contais the reference to next for single linked list or doubly linked list when an item contais the reference to previous and next item
	//No Randon access - you need to search sequencialy in the list
	//Not synchronized - if various threads manage the same linked list you need to do the sincronization
	//If you want to remove a item is very fast because you don’t need to update de all refference just the pointers, is very fast. o(1) complexity
	//Use it to remove -heavy applications


	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(3);
		ll.add(2);		
		ll.add(1);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(6);

		Iterator iter2 = ll.iterator();
		while(iter2.hasNext()){
			System.out.println(iter2.next());
		}
		
		ll.remove();
		ll.remove(6); //remove a primeira ocorrencia desse objecto
		
		System.out.println("Removido");
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

	}

}
