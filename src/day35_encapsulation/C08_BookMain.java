package day35_encapsulation;

import java.util.Scanner;

public class C08_BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C07_Book ktb=new C07_Book();
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen son okudugunuz kitap ismi giriniz");
		ktb.setBookName("calikusu");
		System.out.println("Lutfen  author ismi giriniz");
		ktb.setAuthorName(scan.nextLine());
		System.out.println("1.kitabin :"+ktb.getBookName()+" ikinci kitabin : "+ktb.getAuthorName());
		
	
		
		
	}

}
