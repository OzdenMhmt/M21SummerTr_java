package day20_arrays;

import java.util.Arrays;

public class C5_Array5_Equals_EsitMi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr1[]= {2,1,7,6};
int arr2[]= {7,1,6,2};
System.out.println(Arrays.equals(arr1, arr2));//false

int arr4[]= {4,2,6,8,11};
int arr3[]= {11,4,8,2,6};
Arrays.sort(arr3);
Arrays.sort(arr4);
System.out.println(Arrays.equals(arr4, arr3));//true

int arr5[]= {1,2,3,4,5,6,7};
int arr6[]= {7,6,5,4,3,2,1};
Arrays.sort(arr6);
Arrays.sort(arr5);
System.out.println(arr5.equals(arr6));//false
System.out.println(Arrays.equals(arr5, arr6));//true-arrays esitligini kontrol methodu bu
	}

}
