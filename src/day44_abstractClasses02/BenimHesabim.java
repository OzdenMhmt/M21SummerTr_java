package day44_abstractClasses02;

public class BenimHesabim extends Banka {
	public BenimHesabim(){
		
	}
	public BenimHesabim(double bakiye){
		super.bakiye=bakiye;
		System.out.println(bakiye);
	}
	
	@Override
	public double paraYatir(double miktar) {
		super.bakiye+=miktar;
		return bakiye;
		
	}

	@Override
	public double paraCek(double miktar) {
		super.bakiye-=miktar;
		return bakiye;
		
	}
	public static void main(String[] args) {
		BenimHesabim bh=new BenimHesabim(2625);
		System.out.println(bh.paraYatir(3500));
		System.out.println(bh.paraCek(2750));
		
		
		
	}
}
