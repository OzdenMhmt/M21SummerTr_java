package day22_23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C4_ListArray4 {

	public static void main(String[] args) {
		
		List<String>first=new ArrayList<>();
		List<String>second=new ArrayList<>();
System.out.println(first.equals(second));//true

first.add("a");
System.out.println(first.equals(second));//false

second.add("a");
System.out.println(first.equals(second));//true

System.out.println(first.isEmpty());//false

second.clear();//tum elemanlari siler
	}

}
