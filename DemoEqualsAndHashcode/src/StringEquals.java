
public class StringEquals {

	public static void main(String[] args) {
		String a = new String("123");
		System.out.println(a == "123");			//get false
		System.out.println(a.equals("123"));	//get true
		
		Dog b = new Dog(1);
		Dog c = new Dog(1);
		System.out.println(b.equals(b));		//get true
		System.out.println(b.equals(c));		//get false
		
		Dog d = new Dog2(1);
		System.out.println(d.equals(b));		//return true
		System.out.println(b.equals(d));		//return false
	}

	
}

class Dog{
	int id;
	Dog(int id){
		this.id = id;
	}
}

class Dog2 extends Dog{
	Dog2(int id){
		super(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null ||!( obj instanceof Dog)){
			return false;
		}else{
			return super.id == ((Dog)obj).id;
		}
	}
}