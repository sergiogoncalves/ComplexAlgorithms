package Algoritmos.DesignPatterns.Comportamental;

import java.util.ArrayList;
import java.util.List;
/*
 * You want to know when an event happens
 */
public class ObserverPattern {
	
	// Observer design pattern is useful when you are interested in the state of an 
	//object and want to get notified whenever there is any change. 
	//In observer pattern, the object that watch on the state of another object are called Observer
	//and the object that is being watched is called Subject.
	
	static class SachinCenturyNotifier{
		List<SachinFan> fans = new ArrayList<SachinFan>();
		void register(SachinFan fan){
			fans.add(fan);
		}
		void sachinScoredACentury(){
			for(SachinFan fan:fans){
				fan.announce();
			}
		}
	}
	
	static class SachinFan {
		private String name;
		SachinFan(String name){
			this.name = name;
		}
		void announce(){
			System.out.println(name + "  notified");
		}
	}
	
	public static void main(String[] args) {
		SachinCenturyNotifier notifier = new SachinCenturyNotifier();
		notifier.register(new SachinFan("Ranga"));
		notifier.register(new SachinFan("Ramya"));
		notifier.register(new SachinFan("Veena"));
		notifier.sachinScoredACentury();	
		
		/*
		 * Ranga  notified
		Ramya  notified
			Veena  notified

		 */
	}
}