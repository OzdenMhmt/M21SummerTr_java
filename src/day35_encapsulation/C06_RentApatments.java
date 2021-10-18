package day35_encapsulation;

public class C06_RentApatments {
	private String name;
	private int roomCount;
	private boolean balconyOrNo;
	private int kira = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public boolean isBalconyOrNo() {
		return balconyOrNo;
	}

	public void setBalconyOrNo(boolean balconyOrNo) {
		this.balconyOrNo = balconyOrNo;
	}

	public int kiraHesapla(int roomCount) {
		switch (roomCount) {
		case 0:
			this.kira = 1400;

			break;
		case 1:
			this.kira = 1700;
			break;
		case 2:
			this.kira = 2200;
			break;
		case 3:
			this.kira = 2700;
			break;
		default:
			System.out.println(" lutfen gecerli oda sayisi  giriniz. ");
			break;
		}

		return this.kira;

	}

	public int balconySor(boolean balcony) {
		if (balcony == true) {
			this.kira += 200;
		}
		return this.kira;
	}

}
