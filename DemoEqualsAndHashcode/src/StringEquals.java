
public class StringEquals {

	public static void main(String[] args) {
		String a = new String("456");
		System.out.println(a == "456");			//get false
		System.out.println(a.equals("456"));	//get true
		
		Dog b = new Dog(1);
		Dog c = new Dog(1);
		System.out.println(b.equals(b));		//get true
		System.out.println(b.equals(c));		//get false
	}

	
}

class Dog{
	int id;
	Dog(int id){
		this.id = id;
	}
}