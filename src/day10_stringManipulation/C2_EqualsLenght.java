package day10_stringManipulation;

public class C2_EqualsLenght {

	public static void main(String[] args) {

/*
System.out.println(str.length());//13
System.out.println(" "+10);	//bosluk10	
System.out.println(' ' +10); //42, bosluun ascý degeri 32
*/

		//null bir isaretcidir.bunun hicbir degeri yoktur.		
String str1="Java guzeldir";
System.out.println(str1.length()); //13
String str2="";
System.out.println(str2.length()); //0
 str2=null;
 //System.out.println(str2.length()); hata verir
 
 String str3="kjdka,iv";
 
 System.out.println(str3.length()-1);
 //str3 un son harfinin indexini verir
	}

}
