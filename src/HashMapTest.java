import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<Person, String> map = new HashMap();
		Person p = new Person("Finsen");
		Person p1 = new Person("georgey");
		
		for (int i = 0; i < 100; i++) {
			p = new Person("Finsen:"+i);
			map.put(p,String.valueOf(i));
		}

		
		System.out.println(map);
		System.out.println(map.get(p));
		
	}
	
	

}
