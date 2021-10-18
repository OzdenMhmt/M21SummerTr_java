package day04_increment_matematiksel_islemler;

public class C1__IncrementDecrement {

	public static void main(String[] args) {

int sayi1=10;
int sayi2=20;

sayi1-=5;
sayi2+=10;

System.out.println(sayi2/sayi1);//6

sayi1*=2;
sayi2++;

System.out.println(sayi2/sayi1);//3

sayi1/=2;

double sayi3=sayi2/10;//bu satýrda sayi2 ye atama yok, sayi2 degismez.sayi3 e atama var
System.out.println(sayi3);//3 cunku sayi2 int oldugu icin.
//3.1 vermesi icin sayi2 nin double olmasý gerekir.


System.out.println(sayi2*sayi1);//155
System.out.println(sayi3*sayi1);//15.0


sayi3=(double)sayi2/10; //!!!gecici datacasting yapiliyor sayi2 degismiyor.


System.out.println(sayi3);

System.out.println((double)sayi2); //31.0
//3.1 cunku 20.satirdaki int degistirp double cevirdik

System.out.println(sayi2); //31, sayinin kendisi int


int a=15;
int b=++a; // Pre Increment outpot:16 int b=a++ ise outpot:15
System.out.println(b);



	}

}
