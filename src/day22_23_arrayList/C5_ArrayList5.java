package day22_23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C5_ArrayList5 {

	public static void main(String[] args) {
		// verilen bir array'de tekrar eden elementleri silip
				// tekrarsiz yeni bir array haline getirin
				
				int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3,8,101};
				
				List<Integer>arrdzn=new ArrayList<>();
				
				for (int i = 0; i < arr.length; i++) {
					if (!arrdzn.contains(arr[i])) {
						arrdzn.add(arr[i]);
					} 
				}
				System.out.println(arrdzn);
				Collections.sort(arrdzn);
				System.out.println(arrdzn);
				//yeni bir array olusturup bu elementleri yeni array'a eklemeliyiz
				
				int yeniArr[]=new int [arrdzn.size()];
				
				for (int i = 0; i < arrdzn.size(); i++) {
					yeniArr[i]=arrdzn.get(i);
				}
				
				System.out.println("Tekrarsiz array : "+Arrays.toString(yeniArr));
	}

}
