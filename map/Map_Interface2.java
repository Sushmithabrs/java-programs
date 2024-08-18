package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Interface2 {

	public static void main(String[] args) {
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("sushmitha", "India");
		m1.put("Roma", "mumbai");
		m1.put("Arbin", "pune");
		m1.put("kavitha", "noida");
		//for(Entry<String,String> kv:m1.entrySet()){
		//System.out.println(kv);
		//another way
		Iterator<Entry<String,String>> kv=m1.entrySet().iterator();//entryset.iteratorof iteration
		
		while(kv.hasNext()) {
			System.out.println(kv.next());
			
		}
	}

}
