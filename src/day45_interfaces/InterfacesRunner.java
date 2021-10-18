package day45_interfaces;



public class InterfacesRunner implements Interfaces02 {

public static void main(String[] args) {
		
		// static olarak tanimlanmis bir variable veya method
		// baska class'dan classIsmi.methodIsmi seklinde cagrilabilir
		
		Interfaces02.deneme2();
		
		// Default keyword'u ile olusturdugumuz method ise 
		// obje uzerinden cagrilabilir
		
		InterfacesRunner obj1= new InterfacesRunner();
		obj1.deneme();
}
}
