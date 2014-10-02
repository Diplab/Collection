import java.util.HashMap;
import java.util.Map;

public class DemoBasicOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] list = "I am happy. I am good".split("[.,]?\\s+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String string : list) {
			Integer i = map.get(string);
			map.put(string, (i == null) ? 1 : i + 1);
		}
		System.out.println(map);	//{happy=1, am=2, good=1, I=2}

	}

}
