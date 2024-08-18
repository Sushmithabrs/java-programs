package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Iterations {

	public static void main(String[] args) {
		Map<String,Integer > m1=new HashMap<String,Integer>();
         m1.put("ram", 51);
         m1.put("sita", 49);
         m1.put("supriya", 23);
         m1.put("suman", 33);
        // System.out.println(m1);
         for(Entry<String,Integer>kv:m1.entrySet()) {
        	 System.out.println(kv);
         }
         
	}

}
