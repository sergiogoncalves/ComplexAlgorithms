package Algoritmos.Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Implementacao {

	public static void main(String[] args) {
		HashMap<Integer, String> mapaNomes = new HashMap<Integer, String>(); 
		
		mapaNomes.put(1, "João Delfino");
		mapaNomes.put(2, "Maria do Carmo");
		mapaNomes.put(3, "Claudinei Silva");
		mapaNomes.put(4, "Amélia Mourão");
		
		ComparatorInts compInt = new ComparatorInts(mapaNomes);
		
		Map<Integer, String> mapaOrdenado = new TreeMap(compInt);
		mapaOrdenado.putAll(mapaNomes);
		
		for(Integer valor : mapaOrdenado.keySet()){
			System.out.println(valor + " " + mapaNomes.get(valor));
		}
	
	}
	
	public class ComparatorInts implements Comparator<Integer> {
		
		Map<Integer, String> base;
		
		public ComparatorInts(Map<Integer, String> base) {
			this.base = base;
		}
		
		@Override
		public int compare(Integer o1, Integer o2) {
			return base.get(o1).compareTo(base.get(o2));
		}
	}

}
