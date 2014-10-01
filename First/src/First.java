import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class First {

	public static void main(String[] args) {
//		 ArrayList<Integer> apples = new ArrayList<Integer>();
//		 apples.add(1);
//		 apples.add(2);
//		 for(Integer integer : apples){
//		 System.out.println(integer);
//		 }
		Collection<ro> tree = new TreeSet<ro>();
			tree.add(new ro(77));
			tree.add(new ro(55));
			tree.add(new ro(88));	
			tree.add(new ro(456));
			tree.add(new ro(257));
			
			System.out.println();			
			for (ro ro : tree) {
				System.out.println(ro.r);
			}
	}

}


class ro implements Comparable<ro> {
	int r;
	ro(int r){
		this.r = r;		
	}
	@Override

	public int compareTo(ro arg0){
		
		return this.r - arg0.r;
	}
	
}