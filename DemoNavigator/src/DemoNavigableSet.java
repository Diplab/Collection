import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoNavigableSet {

	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<Integer>();
		for (int i = 1; i < 11; i += 2) {
			set.add(i);// auto boxing
		}
		NavigableSet<Integer> subSet = set.subSet(1, true, 5, true);
		
		//[1, 3, 5, 7, 9]	[1, 3, 5]
		System.out.println(set + "\t" + subSet);
		
		subSet.remove(3);
		//[1, 5, 7, 9]	[1, 5]
		System.out.println(set + "\t" + subSet);
		
		set.add(4);
		//[1, 4, 5, 7, 9]	[1, 4, 5]
		System.out.println(set + "\t" + subSet);
		
		//get java.lang.IllegalArgumentException: key out of range
		//subSet.add(6);
	}

}
