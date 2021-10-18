package day34_encapsulation;

public class C04_Araba {
	String model;
	String renk;
	private int motor;//6.step
	private int yil;//6.step
	
	public C04_Araba(){
		
	}
	
	/*
	 * 1- filedlarý model(String), renk(String), motor(int), yil (int)
	    olan Araba  isimli bir class tanýmlayýnýz.
	 2- bütün fieldlarý parametre alan bir constructor tanýmlayýnýz.
	 3- bütün fieldlarý için getter ve setter metodlarý oluþturunuz.
	 4- ArabaMain isminde main için bir class oluþturunuz.
	 5- Ýki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
	 6- araclarýn motor ve yýlýný hatalý veri girisine karsi kapsulleyiniz.
	 */
		
		
		public C04_Araba(String model, String renk, int motor, int yil) {
		super();
		/*this.model = model;
		this.renk = renk;
		this.motor = motor;
		this.yil = yil;
		burdan aldigi icin eksi cikti*/
		setModel(model);
		setMotor(motor);
		setRenk(renk);
		setYil(yil);
		
	}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getRenk() {
			return renk;
		}

		public void setRenk(String renk) {
			this.renk = renk;
		}

		public int getMotor() {
			return motor;
		}

		public void setMotor(int motor) {
			if (motor>0) {
				this.motor = motor;
			}else this.motor = -motor;
			
		}

		public int getYil() {
			return yil;
		}

		public void setYil(int yil) {
			if (yil>0) {
				this.yil = yil;
			}else {
				this.yil = -yil;
			}
			
		}
		
		
}
