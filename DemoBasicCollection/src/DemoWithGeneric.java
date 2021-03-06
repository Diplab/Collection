import java.util.ArrayList;


public class DemoWithGeneric {


	public static void main(String[] args) {
		ArrayList<Apple2> apples = new ArrayList<Apple2>();
		apples.add(new Apple2());
		
		//below will get :
		//	Description	Resource	Path	Location	Type
		//	The method add(Apple2) in the type ArrayList<Apple2> is not applicable 
		//		for the arguments (Orange)	
		//apples.add(new Orange2());
		
		Apple2 aApple = apples.get(0);
		System.out.println(aApple.getClass().getSimpleName() + "\t" + aApple.getId());
		
		//Here will get java.lang.ClassCastException
		//Apple bApple = (Apple) apples.get(1);
		//System.out.println(aApple.getClass().getSimpleName() + "\t" + aApple.getId());
	}

	
}

class Apple2{
	private static long counter = 0;
	private long id = counter++;
	public long getId(){
		return id;
	}
}

class Orange2{
	
}