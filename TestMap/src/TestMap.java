import java.util.HashMap;


public class TestMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> test = new HashMap<Integer, Integer>();
		
		for(int i=1;i<10;i++){
			test.put(i, i*2);
			
		}
		System.out.println(test.containsKey(1));  //true
		
		for(int i=1;i<10;i++){
		System.out.println("key="+i+"  value="+test.get(i));
		}
		
		
		
	}

}
