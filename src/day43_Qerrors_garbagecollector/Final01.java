package day43_Qerrors_garbagecollector;

public class Final01 {
static final int AGE=33;

public static void main(String[] args) {
	//AGE=34;
	@SuppressWarnings("unused")
	final int maas=5000;
	@SuppressWarnings("unused")
	int zam=3000;
	//maas+=zam;
	//sayi+=2; final olarak tanimlanan variable'a
	//yeni deger atanamaz
}
}
