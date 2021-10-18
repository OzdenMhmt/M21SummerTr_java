package day50_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps3 {

	public static void main(String[] args) {
		Map<Integer,String>map1=new HashMap<>();
		map1.put(101, "Ali, Can, Java");
		map1.put(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, c#");
		System.out.println(map1);//{101=Ali, Can, Java, 102=Veli, Yan, java, 103=Ali, Yan, c#}
		System.out.println(map1.size());//3
		
		System.out.println(map1.entrySet());//[101=Ali, Can, Java, 102=Veli, Yan, java, 103=Ali, Yan, c#]
		//15.satir korlibracesli,map--->18.satir koseli parantezli,bu set
		
		System.out.println(map1.entrySet().size());//3
		// entry key,value ikilisinden olusan tum eleman
		//set'e cevirdi ama 3 elamnli seklinde cevirdi
		
		Set<Entry<Integer, String>> mapdenSet=map1.entrySet();
		
		for (Entry<Integer, String> each : mapdenSet) {
			System.out.println(each);
		}
		
		System.out.println(map1.equals(mapdenSet));//false
		System.out.println(map1.get(101));//Ali, Can, Java
		//map1.get(Object key)-->cok kullaniriz. 
	}

}
