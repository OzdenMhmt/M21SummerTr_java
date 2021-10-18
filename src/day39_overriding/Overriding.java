package day39_overriding;

public class Overriding {
	/*
	  Overriding:
--> Parent class'daki bir METHOD'U child class'a gore ozellestirerek 
    kullanmanin adidir
    
    OVERRÝDÝNG KURALLARÝ
    
    
--> Overriding creat edilirken "Method Signature"(name + parametre)
    KESINLIKLE-ASLA DEGISTIRILEMEZ !     

--> Overriding creat edilirken "Access modifier" belirli kurallara gore
    degistirilebilir 	 

--> Overriding creat edilirken "Return Type" belirli kurallara gore
    degistirilebilir 	 

--> Overriding creat edilirken "Method Body" %99 degistirilir ama
    degistirilmezse CTE vermez (amelelik olur) overriding amaci
    body creat etmek :)

--> Overriding creat edilirken "Parent-Child" relationship sarttir.
   *AHAN DA TRICK ==> inheritance olmadan overriding olmaz OLAMAZZZ 

--> Overridden method ==> Parent class'daki method'dur(zavalli ezilen)       
--> Overriding method ==> Child class'daki method'dur(zalim ezen !)       

-->"Overriding  method"(child)'in AccModi. ye "Overridden method"(parent) ile ayni ya da dah genis olmali.
	evlat babanin erisimini daraltamaz ama genisletebilir.
	SubAccMod >= SuperAccMod

--> overriding ve overridden methodlarin return type'i match olmali	


--> "Overriding method" (child )'ýn return type Wrapper clas'dan ise "Overridden method" (parent) return type Wrapper clas'dan
     olmali kendinden olmayani kanul etmez 
     istisna return parent data type-child data type
     
 -->"Overrdihing method(child)'in return type ile
  "overridden method" return arasinda is_a"Parent-Child" relationship sarttir.
  
 11) Static method'lar overriding elimezler
 12)Private methodlar overriding edilemezler.
 13)Final method'lar overriding edilemezler.
 final: son hali artik degistirilemez.
 
 14)"Polymorphsim" Buzz gibi interwiew ...__>"overloading ve "overriding" olusan yapiya denir.
 
 "overlodaing"-->public void yemek(){} 
 				public void yemek(String tatli){} 
 				public void yemek(String tatli,int ucret){}
 
 "overriding"--> public void icmek(){syso gazoz} 
 				public void icmek(){syso gazoz(dark ve sek bir kahve)} 
 				public void yemek(){syso ucret}
 				
 a) Overloading’de method signature degisir, Overriding’de degismez
 b) Overriding’de  inheritance gerekir,Overloading’de gerekmez
 
 c) Overloading’de body istenirse degistirilebilir, Overriding’de body %99
degistirilir

 d)final, static ve private methodlar Overload edilebilir, ama Override
edilemezler

 e)Overloading Compile Time Polymorphism (static)’dir,
  Overriding is Run Time Polymorphism’(dynamic)dir
 
 
 
 
	 */
}
