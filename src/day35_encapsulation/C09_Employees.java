package day35_encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* TODO
Burada iki adet class vard�r.
 Biri Main di�eri ise Employees,
Employees(�al��anlar) class'�nda;
Bu variable'lar� olu�turunuz;
private String name,
private int salary,
private String dob (date of birth) (Do�um tarihi)
getter ve setter olu�turunuz.
Main class'�n i�inde; kullanicidan name dob ve slary bilgilerini alip
E�er employee 18 ya��nda b�y�kse, Welcome to our company Fernando your salary is 80000. yazd�r�n�z.
E�er Fernando 18 ya��ndan k���kse, come back when you are 18 years old. yazd�r�n�z.
E�er Fernando 18 ya��ndaysa,  we can have inter with you after that you can have a 80000 salary yazd�r�n�z.
�rnek:
Name is Fernando
dob is 11/23/2000
Salary is 80000
todo  ageCalculator isminde bir method olu�turunuz. �uanki tarih - do�um y�l� = employee age
*/

public class C09_Employees {
	private String name;
	private int salary;
	private String dob;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	public int yasHesapla(String dob) {
		LocalDate bugun =LocalDate.now();
		
		String strDate=dob;
		DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		LocalDate dTarihi =LocalDate.parse(strDate, format);
		//kullanicinin string girdigi MM//dd//yyyy formata gore parcala
		
		int age=bugun.getDayOfYear()-dTarihi.getYear();
		//bugun- kulanici dogum yili=yas
		
		return age;
	}
}
