package day38_inheritance;

public class Runner {

	public static void main(String[] args) {
		Cat c1 = new Cat();// p.siz con ile obj
		/*
		 * Ayni isimli variable'lar callobj. call edilirken once objenin kendi
		 * class'indaki variable call edilir sonra parentindeki variable call edilir
		 */
		System.out.println(c1.a);// 5 animal
		System.out.println(c1.c);// 9 kendi class c mammal dan degil
		System.out.println(c1.d);// 5 kendi class
		System.out.println(c1.m);// 4 mammal
		c1.mM();//animal
		c1.mC();//cat
		c1.mA();//mammal
		
		/*
		 method call edilirken ayni isimli methodlarin hangisinin alinacagina karar verir
		 childeren parente giderken hangisinden once varsa onu alir
		 */
		
		Mammal c2 = new Cat("x");//c2 obj kendi class'ý mammal
		System.out.println(c2.a);//5 animal classtan-call
		System.out.println(c2.c);//7 mammal class-call
		System.out.println(c2.m);//4 mammal class-call
	
		
		
		c2.mA();//mammal
		c2.mC();//cat cons-->call
		c2.mM();//animal
		//c2.mD(); methodu gormuyor
		
		/*Animal c3 = new Cat();
		System.out.println(c3.a);
		System.out.println(c3.m);
		
		c3.mA();//animal
		c3.mM();//animal*/
		Mammal n1 = new Mammal();
		
		Animal c3=new Cat();
	//n1 ve c3 obj uzerinde	
	}
}
