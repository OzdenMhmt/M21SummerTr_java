package day43_Qerrors_garbagecollector;

public class Exam01 {
	/*
	'ortalama' isminde bir method oluþturun 
	ve int v  - int f  isminde 2 adet parametresi olsun.
	int v = vize
	int f = final
	Eðer  vize 100 den büyük, veya final 100'den büyük,
	 veya vize 0'dan küçük, veya final 0'dan küçük ise,
	Sistem ArithmeticException hatasý versin
	 ve "Notlar 0-100 arasýnda olmalý" mesajýný döndürsün.
	Diðer durumlarda ise,
	vizenin yüzde 40 ýný, finalin yüzde 60 ýný alsýn ve toplasýn.(ortalama =)
	vizeye 120, finale 80 girin.
	Programýn çalýþmasýný saðlayýn. (handle edin)
	 */
	static int v;
	static int f;
	public static void main(String[] args) {
	try {
		ortalama( 80, 120);
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("kod handle edilmis");

	}
	public static void ortalama(int v, int f) {
		
		if(v>100 || f>100 || f<0 || v<0) {
			throw new ArithmeticException("\"Notlar 0-100 arasýnda olmalý\"");
			
		}else {
			System.out.println("ortalama :"+(((v*0.4)+(f*0.6))));
		}
		
	}

}
