import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoCollectionView {

	public static final String[] LIST = "I am happy. I am good"
			.split("[.,]?\\s+");

	static <K, V> boolean validate(Map<K, V> attrMap, Set<K> requiredAttrs,
			Set<K> permittedAttrs) {
		boolean valid = true;
		Set<K> attrs = attrMap.keySet();

		if (!attrs.containsAll(requiredAttrs)) {
			Set<K> missing = new HashSet<K>(requiredAttrs);
			missing.removeAll(attrs);
			System.out.println("Missing attributes: " + missing);
			valid = false;
		}
		if (!permittedAttrs.containsAll(attrs)) {
			Set<K> illegal = new HashSet<K>(attrs);
			illegal.removeAll(permittedAttrs);
			System.out.println("Illegal attributes: " + illegal);
			valid = false;
		}
		return valid;
	}

	public static Map<String, Integer> getMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String string : LIST) {
			Integer i = map.get(string);
			map.put(string, (i == null) ? 1 : i + 1);
		}
		return map;
	}

	public static void main(String[] args) {

		Map<String, Integer> map = getMap();
		
		//throw  java.lang.UnsupportedOperationException
		//map.keySet().add("123");
		Set<String> requiredAttrs = new HashSet<String>(map.keySet());
		requiredAttrs.add("123");
		Set<String> permittedAttrs = new HashSet<String>(map.keySet());
		permittedAttrs.add("234");
		map.put("adsf",2);
		System.out.println(validate(map, requiredAttrs, permittedAttrs));
	}
}
