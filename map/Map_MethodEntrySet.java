package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_MethodEntrySet {

	public static void main(String[] args) {
		Map<String,String> m1=new HashMap<>();
		m1.put("India","Delhi" );
		m1.put("china","beijing" );
		m1.put("indonesia","jakarta" );
		m1.put("Iran","tehran" );
		m1.put("japan","tokyo" );
		System.out.println(m1.containsKey("India"));
		System.out.println(m1.containsValue("Delhi"));
		m1.put("Lenanon", "beirut");
		//System.out.println(m1);
		//System.out.println(m1.keySet());
		for(Entry<String,String> kv:m1.entrySet())
		{
			System.out.println(kv);
		}


}}
