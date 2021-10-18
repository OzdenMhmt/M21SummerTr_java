package day47_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList1 {
	// linked bagli demektir
	// linked list'te tum elemanlar tren gibi birbirine baglidir

	public static void main(String[] args) {

		List<String> liste = new ArrayList<>();
		// List-->interface, ArrayList--->class
		// Collections'da obje olustururken
		// olusturmak istedigimiz collection'in class mi yoksa interface'mi
		// olduguna bakmaliyiz
		// Eger olusturmak istedigimiz collection interface ise
		// data turu olarak o interface'i, constructor olarak ise uygun bir class
		// secmeliyiz
		// Simdiye kadar List(interface) olustururken constructor olarak ArrayList()
		// seciyorduk

		LinkedList<String> ll1 = new LinkedList<>();

		ll1.add("A");
		ll1.add("B");

		System.out.println(ll1);// [A, B]

		ll1.add(1, "C");
		System.out.println(ll1);// [A, C, B]

		liste.add("X");
		liste.add("Y");

		ll1.addAll(liste);
		System.out.println(ll1);// [A, C, B, X, Y]

		ll1.addAll(2, liste);
		System.out.println(ll1);// [A, C, X, Y, B, X, Y]

		ll1.addLast("K");
		System.out.println(ll1);
		// LinkedList List ve Queue interface'lerine implemnt ile child oldugundan
		// her iki interface'deki tum method'lari override etmek zorundadir.
		// Islev olarak ayni isi yapan addLast() queue'dan ve add() ise List'den inherit
		// edilmistir

		
		
		// Ben bir linkedList olusturmak istiyorum ama sadece List ozelliklerini tasisin
		List<String>listlist=new LinkedList<>();
		listlist.add("sadece listten gelen ozellikler var");
		
		// Ben bir linkedList  olusturmak istiyorum ama 
		//sadece Queue ozelliklerini tasisin
		Queue<String>queuelist=new LinkedList<>();
		queuelist.add("sadece queue'ten gelen ozellikler var");
	}

}
