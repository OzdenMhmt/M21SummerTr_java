package day04_increment_matematiksel_islemler;


public class C4_Modulus {

	public static void main(String[] args) {
//modulus islemi kalaný verir		
//5496 sayisinin rakamlar toplamini bulalim
int sayi=5496;
int rakamlarToplami=0;

//bir sayinin rakamlar toplamini bulmak için her basamak degerinde 3 islem yaparýz
//1- sayi%10 ile son basamgý elde ederiz
int rakam=sayi%10; //5496%10 6
 

//2- bu rakami rakamlarToplamina ekleriz.		
rakamlarToplami+= rakam ; // 0+6=6


//3-degerini aldigimiz son basamaktan kurtulmak icin sayiyi 10 a boleriz.
sayi/=10; //5496/10=549

//bu satira geldigimde sayi=549, rakamlar toplami=6 3 basamak kaldi

rakam=sayi%10; // 549%10 9
rakamlarToplami+= rakam; // 6+9=15
sayi/=10; //549/10=54(int)
//bu satira geldigimde sayi=54 rakamlar toplami=15 2 basamak kaldi


rakam=sayi%10; //54%10 4
rakamlarToplami+= rakam; //15+4=19
sayi/=10; //54/10=5(int)
//bu satira geldigimde sayi=5, rakamlar toplami=19 1 basamak kaldi


rakam=sayi%10;
rakamlarToplami+= rakam;
sayi/=10;
//bu satira geldigimde sayi=0.5 yani ýnt oldugu icin 0, rakamlar toplami=24 0 basamak kaldi


System.out.println("Rakamlar yoplami : " +rakamlarToplami);
System.out.println("Sayinin sondegeri : " +sayi);





	}

}
