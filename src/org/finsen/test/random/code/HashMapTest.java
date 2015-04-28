package org.finsen.test.random.code;
import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<Person, String> map = new HashMap();
		Person p = new Person("foo");
		Person p1 = new Person("bar");
		
		for (int i = 0; i < 100; i++) {
			p = new Person("foo:"+i);
			map.put(p,String.valueOf(i));
		}

		
		System.out.println(map);
		System.out.println(map.get(p));
		
	}
	
	

}
