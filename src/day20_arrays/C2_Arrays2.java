package day20_arrays;

public class C2_Arrays2 {

	public static void main(String[] args) {
		//Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		
		int arr[]= {2,4,6,8,10};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println("verilen array'daki tum elementlerin toplami : "+toplam);
		
		int top2=0;
		for (int i = 0; i < arr.length; i++) {
			top2+=arr[i];
			
		}
		System.out.println(+top2);
	}

}
