package day22_23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>hayvan=new ArrayList<>();
System.out.println(hayvan.size());//0
System.out.println(hayvan.isEmpty());//true

List<Integer>sayilar=new ArrayList<>();
sayilar.add(10);
sayilar.add(20);
System.out.println(sayilar.size());//2
System.out.println(sayilar.isEmpty());//false
System.out.println(sayilar);//[10, 20]
sayilar.add(30);
sayilar.add(40);


//System.out.println(sayilar.remove(2));//30
//remove method'u iki turlu kullanilabilir
//1-si silmek istedigimiz elementin index'ini yazarsak o elemeinti siler
//ve delil olarak sildigi elementi bize dondurur

int silinenEleman=sayilar.remove(2);

System.out.println(sayilar);//[10, 20, 40]

sayilar.add(silinenEleman);
System.out.println(sayilar);//[10, 20, 40, 30]

//remove ikinci yontem olarak direk silmek istedigimiz degeri yazabiliriz
//sayilar.remove(20);
System.out.println(sayilar);
//eger listemiz sayilardan olsuyorsa biz silmek istedigimiz elementi index olarak algilar
//string ici boyle bir problem olmaz

List<String>isimler=new ArrayList<>();
isimler.add("Ali");
isimler.add("Ayse");
isimler.add("Zeki");
System.out.println(isimler.remove("Zeki"));//true
System.out.println(isimler);//[Ali, Ayse]

isimler.remove("Ayse");
System.out.println(isimler);//[Ali]

boolean sonuc=isimler.remove("Mehmet");
if (sonuc) {
	System.out.println("Mehmet'i buldum ve sildim");
}else {
	System.out.println("Mehmet'i bulmadim dolayisiyla silemedim");
}
isimler.removeAll(isimler);
System.out.println(isimler);//[]
System.out.println(isimler.isEmpty());//true

	}

}
