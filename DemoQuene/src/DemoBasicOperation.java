import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoBasicOperation {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		initializeMap(map);
		System.out.println(map);	//{happy=1, am=2, good=1, I=2}
		
		map = new TreeMap<String, Integer>();
		initializeMap(map);
		System.out.println(map);	//{I=2, am=2, good=1, happy=1}: in alphabetical order
		
		//all general-purpose Map implementations provide constructors that take a Map object 
		//and initialize the new Map to contain all the key-value mappings in the specified Map.
		map = new LinkedHashMap<String, Integer>(map);
		System.out.println(map);	//{I=2, am=2, good=1, happy=1}
		
		
		System.out.println(map);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.putAll(map);
		System.out.println(map2);	//{happy=1, am=2, good=1, I=2}
		
		map2.clear();
		System.out.println(map2);	//{}

	}
	public static final String[] LIST = "I am happy. I am good".split("[.,]?\\s+");
	public static void initializeMap(Map<String, Integer> map){
		for (String string : LIST) {
			Integer i = map.get(string);
			map.put(string, (i == null) ? 1 : i + 1);
		}
	}

}
