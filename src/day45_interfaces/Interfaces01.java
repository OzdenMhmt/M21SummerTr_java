package day45_interfaces;

public interface   Interfaces01  {
	
public void motor();
// interface icinde abstract method'lar ve 
// OZEL concrete method'lar olabilir

/*
Bir abstract method'un body'si olmadigindan o method'un istenen 
dinamik ozellligi nasil gerceklestirecegini bilmemiz mumkun degidlir
Sadece be yapacagini biliriz.

Bu method bize sunu anlatir;
beni inherþt eden her conrete class'in dinamik motor ozelligi olmalidir.
 */
void vites();//beni inherþt eden her conrete class'in dinamik vites ozelligi olmalidir.
//aslinda bunu  public abstract void vites(); kabul eder.
abstract void kasa();//beni inherit eden her conrete class'in dinamik kasa ozelligi olmalidir.
//aslinda bunu public abstract void kasa(); kabul eder.

//Interface'de sadece ABSTRACT,PUBLÝC methodlar 'lar olur
//bu iki keyword'u yazsak da yazmasak da Java tum methodlari bu sekilde kabul eder,

//Java'da interface olsurumak istiyorsak bastan o sekilde olusturmaliyiz.
//Bir class sonradan bazi keyword'ler yazilarak interface yapilamaz

String ISIM="mehmet";// Java isim kelimesini italik ve bold yapti
// Demmek ki tum variable'lar final ve static'tir
}
