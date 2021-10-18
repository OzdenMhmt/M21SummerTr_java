package day43_exceptions;

public class InvalidEmailCheckedException extends Exception{

	
	private static final long serialVersionUID = 1L;
//Java exception'larin tekrarsiz olmasini saglamak icin her exception'a unique bir kod verir
	 
	

InvalidEmailCheckedException(String message){
	//Object ile class'dan ve parent'inden field ve variable call yapabilelim
	super(message);
}
}