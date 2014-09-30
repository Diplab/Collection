import java.util.ArrayList;
import java.util.Collection;

public class DemoCollectionForeach {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			c.add(i);	//auto boxing
		}
		
		for (Integer integer : c) {
			System.out.println(integer);	//auto unboxing
		}
	}

}
