package day20_arrays;

import java.util.Arrays;
import java.util.Iterator;

public class C1_Arrays1 {

	public static void main(String[] args) {
		/*
		 verilen 3 elementli bir array'in
		 tum elemanlarini bir soldaki satira tasiyan program yazin.
		 */
int arr[]= {1,2,3};

int temp=arr[0];

arr[0]=arr[1];		
arr[1]=arr[2];
arr[2]=temp;	
System.out.println(Arrays.toString(arr));
//array kac elementli olursa olsun,tum elementleri
//bir sola tasiyacak kod yaziniz.

int arr2[]= {1,3,9,4,6,8};

temp=arr2[0];

for (int i = 0; i < arr2.length-1; i++) {
	arr2[i]=arr2[i+1];
} 
System.out.println(Arrays.toString(arr2));//[3, 9, 4, 6, 8, 8]
arr2[arr2.length-1]=temp;
System.out.println(Arrays.toString(arr2));//[3, 9, 4, 6, 8, 1]

	int arr3[]= {3,5,7,9};
	int temp2=arr3[0];
	for (int i = 1; i < arr3.length-1; i++) {
		arr3[i]=arr3[i+1];
		arr3[arr3.length-1]=temp;
	}
	}

}
