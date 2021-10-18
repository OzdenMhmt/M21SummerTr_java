package day21_multiDimensionalArrays;

import java.util.Arrays;

public class C1_MultiDimensionalArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[][] arr=new int [3][2];

arr[0][0]=1;
arr[0][1]=2;

arr[1][0]=3;
arr[1][1]=4;

arr[2][0]=5;
arr[2][1]=6;

System.out.println(Arrays.toString(arr[0])); //[1, 2]
System.out.println(Arrays.toString(arr[1])); //[3, 4]
System.out.println(Arrays.toString(arr[2])); //[3, 4]

//System.out.println(Arrays.toString(arr[0][1])); hata verir
System.out.println(arr[0][1]);//2
System.out.println(arr[2][0]);//5

System.out.println(Arrays.toString(arr));//sadece outer array'in referansini yazdirir


	}

}
