package day42_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exceptions4 {

	public static void main(String[] args) {
		// List ve array'de varolmayan bir index ile islem yapmak isterseniz
		// Java IndexOutOfBoundsException verir

		int arr[] = { 1, 2, 3, 4 };
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); // 4
		//System.out.println(arr[5]);
		// java.lang.ArrayIndexOutOfBoundsException
		
		List<String> gzlinsn=new ArrayList<>();
		gzlinsn.add("firat");
		gzlinsn.add("merve");
		gzlinsn.add("hakan");
		
		System.out.println(gzlinsn.get(2));
		System.out.println(gzlinsn.get(0));
		System.out.println(gzlinsn.get(5));
		//java.lang.ArrayIndexOutOfBoundsException:
		
		//
	}

}
