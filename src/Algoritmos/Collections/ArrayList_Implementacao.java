package Algoritmos.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Implementacao {

	public ArrayList_Implementacao() {
		// TODO Auto-generated constructor stub
	}
	
	/* RUIM PARA REMOVER E MELHOR PARA ACHAR UM ITEM
	  It has a Randon access that is very fast o(1) accessing items by the index 
	  having a linear complexity but if you want to remove the item it’s not so efficient. We don’t need to specify the capacity.
		
		It’s better to find item givin the position but is bad to remove it
		It’s not syncronized

	 */

	public static void main(String[] args) {

		List<String> agenda = new ArrayList();
		
	    agenda.add("Juca Bala;11 1111-1111");
	    agenda.add("Marcos Paqueta;22 2222-2222");
	    agenda.add("Maria Antonieta;33 3333-3333");
	    agenda.add("Antônio Conselheiro;44 4444-4444");

		for (int i = 0; i < agenda.size(); i++) {
			System.out.printf("Posição %d- %s\n", i, agenda.get(i));
		}

	}

}
