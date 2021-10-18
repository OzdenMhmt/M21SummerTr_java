package day32_stringBuilder;

public class C1_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Mehmet");
		System.out.println(sb);
		sb.append(" Hoca");
		System.out.println(sb);
		sb.append(" Java").append(" anlatir.");
		System.out.println(sb);
		//append ile arka arkaya ekleme yapilabilir
		//Mehmet Hoca Java anlatir.
		sb.append("Java cok guzel",0,4);
		System.out.println(sb);
		//String tumu egil bir bolumu eklenebilir
		//Mehmet Hoca Java anlatir.Java
		
		StringBuilder sb1 = new StringBuilder(5);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.append("Kemal");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.append(" Can");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}

}
