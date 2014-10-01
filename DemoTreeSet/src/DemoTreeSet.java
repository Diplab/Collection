import java.util.Collection;
import java.util.TreeSet;


public class DemoTreeSet {

	public static void main(String[] args) {
		Collection<Dog> set = new TreeSet<Dog>();
		set.add(new Dog(10));
		set.add(new Dog(5));
		set.add(new Dog(5));
		set.add(new Dog(7));
		
		System.out.println(set);
		for (Dog dog : set) {
			System.out.println(dog.age);
		}
	}

}

class Dog implements Comparable<Dog>{
	int age;
	
	Dog(int age){
		this.age = age;
	}

	@Override
	public int compareTo(Dog arg0) {
		return this.age - arg0.age;
	}
}