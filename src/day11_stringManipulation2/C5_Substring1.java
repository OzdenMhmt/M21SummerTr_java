package day11_stringManipulation2;

public class C5_Substring1 {

	public static void main(String[] args) {
		String str="Java OOP konsepti kullanir";
System.out.println(str.substring(3)); //a OOP konsepti kullanir
System.out.println(str.substring(10)); //onsepti kullanir
System.out.println(str.length()); //26
System.out.println(str.substring(26)); // 
System.out.println(str.substring(25)); //r
//System.out.println(str.substring(27)); // rte hata
System.out.println(str.substring(0,25)); //Java OOP konsepti kullani
System.out.println(str.substring(1,4));//ava
System.out.println(str.substring(5,11));//OOP ko
System.out.println(str.substring(8,8)); // bosluk
//System.out.println(str.substring(8,2));// rte hata
System.out.println(str.substring(3,4)); //a
	

	}

}
