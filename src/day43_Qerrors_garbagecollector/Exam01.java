package day43_Qerrors_garbagecollector;

public class Exam01 {
	/*
	'ortalama' isminde bir method olu�turun 
	ve int v  - int f  isminde 2 adet parametresi olsun.
	int v = vize
	int f = final
	E�er  vize 100 den b�y�k, veya final 100'den b�y�k,
	 veya vize 0'dan k���k, veya final 0'dan k���k ise,
	Sistem ArithmeticException hatas� versin
	 ve "Notlar 0-100 aras�nda olmal�" mesaj�n� d�nd�rs�n.
	Di�er durumlarda ise,
	vizenin y�zde 40 �n�, finalin y�zde 60 �n� als�n ve toplas�n.(ortalama =)
	vizeye 120, finale 80 girin.
	Program�n �al��mas�n� sa�lay�n. (handle edin)
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
			throw new ArithmeticException("\"Notlar 0-100 aras�nda olmal�\"");
			
		}else {
			System.out.println("ortalama :"+(((v*0.4)+(f*0.6))));
		}
		
	}

}
