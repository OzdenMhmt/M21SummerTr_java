package day31_varargsstringbuilder;

public class C2_Varargs2 {

	public static void main(String[] args) {
		//Varargs kullanarak verilen Stringleri birlestiren 
		//concat isimli bir method olusturunuz

		
		concat("m","e","r","v","e");
		
	}

	

	private static void concat(String...str) {
		String birlestir="";
		String birlestir2="";
		for (String each: str) {
			birlestir=birlestir.concat(each);
			birlestir2+=each;
		}
		System.out.println(birlestir);//merve
		System.out.println(birlestir2);//merve
	}

}
