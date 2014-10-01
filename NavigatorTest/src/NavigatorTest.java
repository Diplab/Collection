import java.util.NavigableSet;
import java.util.TreeSet;


public class NavigatorTest {

	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<Integer>();
		for (int i = 1; i < 20; i += 3) {
			a.add(i);
		}
		TreeSet<Integer> subSet = (TreeSet<Integer>) a.subSet(1, true, 10, true);
		
		System.out.println(a + "\t" + subSet);
		
		subSet.remove(7);
		
		System.out.println(a + "\t" + subSet);
		
		subSet.add(2);
		
		System.out.println(a + "\t" + subSet);
		
		
	}

}
