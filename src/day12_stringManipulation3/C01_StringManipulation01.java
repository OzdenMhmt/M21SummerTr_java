package day12_stringManipulation3;

public class C01_StringManipulation01 {

	public static void main(String[] args) {
	
		String str="Java candir";
		System.out.println(str.substring(5));	//candir
		System.out.println(str.substring(10)); //r
		System.out.println(str.substring(11)); //11==length
		//System.out.println(str.substring(20)); // rte hatasi verir
		System.out.println(str.substring(5,8)); //can
		System.out.println(str.substring(2,3)); //v
		System.out.println(str.substring(5,5)); // hiclik
		System.out.println(str.substring(5,11)); //candir
		//System.out.println(str.substring(5,1)); // rte hata verir
	


	//18-trim
			String str8="   java ogrenmek cok guzel. ";
			System.out.println(str8);//    java ogrenmek cok guzel.
			System.out.println(str8.length());//28
			System.out.println(str8.trim());//java ogrenmek cok guzel.
			System.out.println(str8.trim().length());//24
}
}