package hashmapconcept;

import java.util.Map;
import java.util.TreeMap;

public class HashmapConcept {

	public static void main(String[] args) {
		
		// key-value pair:<k,v>
		// does not maintain the order
		// random order
		// Map<String, Integer> map=new HashMap<>();
		
		// order based
		// Map<String, Integer> map=new LinkedHashMap<>();
		// sorted order
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("tom", 100);
		map.put("tom1", 200);
		map.put("tom2", 300);
		map.put("tom4", 400);
		map.put("tom5", 500);
		// map.put(null, 500);
		map.put("a", 9000);
		map.put("A", 900);
		map.put("pavan", 300);
		map.put("test", 90);
		map.put("1", 5);
		map.put("$", 5);
		
		// order of insertion is random
		// null will be stored as key in 0th position
		map.forEach((k,v) -> System.out.println(k +":"+v));
	}

}
