import java.util.LinkedList;
import java.util.ListIterator;

public class BasicIteratorDemo {

	public static void main(String[] args) {
		LinkedList<Integer> set = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++) {
			set.add(i);
		}

		ListIterator<Integer> iterator = set.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.nextIndex() + "\t" + iterator.next());
		}

		while (iterator.hasPrevious()) {
			System.out.println(iterator.previousIndex() + "\t" + iterator.previous());
		}
		
		iterator.remove();	//1 will be remove

		//throw java.lang.IllegalStateException
		//iterator.remove();
		System.out.println(set);  //[2, 3, 4, 5]
	}

}
