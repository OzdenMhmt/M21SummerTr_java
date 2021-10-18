package day35_encapsulation;

import java.util.Scanner;

public class C05_RentApatmentsMain {
	/* TODO
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo
​
   Bütün variable'lar için getter ve setter oluşturunuz.
​
    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.
​
    Main class'ın içinde;
    userName rent is amountOfRent
     */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("adinizi giriniz : ");
		String name =scan.nextLine();
		
		System.out.println("dairenizde talep etigiginiz oda sayisi: ");
		int odaSayisi=scan.nextInt();
		
		System.out.println("balkon ister misiniz  (true/false : ");
		boolean balcony=scan.nextBoolean();
		
		C06_RentApatments kiraci=new C06_RentApatments();
		//kiraci objesini creat ettik.
		
		kiraci.setName(name);
		kiraci.setRoomCount(odaSayisi);
		kiraci.setBalconyOrNo(balcony);
		
		int toplamKira=kiraci.balconySor(balcony)+kiraci.kiraHesapla(odaSayisi);
		System.out.println(kiraci.getName()+" bey kira ucretiniz : "+toplamKira);
		
		
	}

}
