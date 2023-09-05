import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		
		map.put("Scott", "tiger" );
		map.put("jack", "jill" );
		map.put("polo", "lili" );
		map.put("jack", "rose" );
		
		System.out.println("scott" + map.get("scott"));

		System.out.println("polo" + map.get("polo"));

		System.out.println("jack:" + map.get("jack"));
		
		//print all the keys and values without manually feeding keys
		
		for (String key : map.keySet()) {

            String value = map.get(key);

            System.out.println("Key: " + key + ", Value: " + value);

        }
	
	}

}
