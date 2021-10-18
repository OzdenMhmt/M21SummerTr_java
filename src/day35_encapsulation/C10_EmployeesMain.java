package day35_encapsulation;

import java.util.Scanner;


public class C10_EmployeesMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("isminizi giriniz");
		String name=scan.nextLine();
		
		System.out.println("dogum yilini MM//dd/yyy giriniz");
		String dob=scan.next();
		
		System.out.println("talep ettiginiz maas giriniz");
		int salary=scan.nextInt();
	
		
		
		C09_Employees isci= new C09_Employees();
		isci.setName(name);
		isci.setDob(dob);
		isci.setSalary(salary);
		int calisanYas=isci.yasHesapla(dob);
		
		if (calisanYas>18) {
			System.out.println("Welcome to our company "+isci.getName()+" your salary is "+isci.getSalary());
		}else if (calisanYas<18){
			System.out.println("come back when you are 18 years old");
		}else if (calisanYas==18) {
			System.out.println("we can have inter with you after that you can have a"+ salary+" salary");
		}
				
		//System.out.println(isci.getDob()+isci.getName()+isci.getSalary());
	}

}
