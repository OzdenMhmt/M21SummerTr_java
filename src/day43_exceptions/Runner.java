package day43_exceptions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws InvalidEmailCheckedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("e-mail giriniz");
		String email=scan.nextLine();
		mailDogrula(email);
		scan.close();
	}

	public static void mailDogrula(String email) throws InvalidEmailCheckedException  {
		if (email.contains("@gmail.com" )|| email.contains("@hotmial.com")) {
			System.out.println("mailiniz basariyla kaydedildi");
		}else {
			throw new InvalidEmailCheckedException("neyin kafasi bu..");
		}
		
	}

}
