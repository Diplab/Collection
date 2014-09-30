import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionAndEquals {

	public static void main(String[] args) {
		Cat a = new Cat("123");
		Cat b = new Cat("123");

		Collection<Cat> setOfCat = new HashSet<Cat>();
		setOfCat.add(a);
		System.out.println(setOfCat.contains(b)); // return false

		Pig c = new Pig("123");
		Pig d = new Pig("123");
		Collection<Pig> setOfPig = new LinkedList<Pig>();
		setOfPig.add(c);
		System.out.println(setOfPig.contains(d)); // return ture
		setOfPig = new HashSet<Pig>();
		setOfPig.add(c);
		System.out.println(setOfPig.contains(d)); // return false
		
		c = new Pig2("123");
		d = new Pig2("123");
		setOfPig = new HashSet<Pig>();
		setOfPig.add(c);
		System.out.println(setOfPig.contains(d)); // return ture
		
		

	}

}

class Cat {
	String name;

	public Cat(String name) {
		super();
		this.name = name;
	}
}



class Pig {
	String name;

	public Pig(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Pig)) {
			return false;
		} else {
			return this.name.equals(((Pig)obj).name);
		}

	}
}

class Pig2 extends Pig{
	public Pig2(String name) {
		super(name);
	}
	
	@Override
	public int hashCode() {
		return super.name.hashCode();
	}
}