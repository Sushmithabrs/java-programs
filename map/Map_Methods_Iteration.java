package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Methods_Iteration {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("Banglore",560067);
		m.put("kolar",563103);
		m.put("mysore",570001);
		m.put("mangalore",575001);
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.putAll(m);
		System.out.println("it is m1"+m1);
		Iterator<Entry<String,Integer>>kv=m.entrySet().iterator();
		while(kv.hasNext()) {
			System.out.println(kv.next());
		}
	}

}
