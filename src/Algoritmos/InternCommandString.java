package Algoritmos;

public class InternCommandString {

	public static void main(String[] args) {
		String one = "hello";
		String two = "hello";
		
		if(one == two){
			System.out.println("They are the same objects");
		}else{
			System.out.println("They are different objects");
			
		}
		
		
		String three = new Integer(76).toString();
		String four = "76";
		
		if(three == four){
			System.out.println("They are the same objects");
		}else{
			System.out.println("They are different objects");
			
		}
		
		
		String five = new Integer(76).toString();
		String six = "76";
		
		if(five.intern() == six.intern()){
			System.out.println("They are the same objects");
		}else{
			System.out.println("They are different objects");
			
		}

	}

}
