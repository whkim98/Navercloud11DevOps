package DAY0325;

public class Shop {
	
	private String sang;
	private int su;
	private int dan;

	public Shop() {
		
	}
	
	public Shop(String sang) {
		this.sang = sang;
	}
	
	public Shop(int su, int dan) {
		this.su = su;
		this.dan = dan;
	}
	
	public Shop(String sang, int su, int dan) {
		this.sang = sang;
		this.su = su;
		this.dan = dan;
	}

	public String getSang() {
		return sang;
	}

	public void setSang(String sang) {
		this.sang = sang;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public void setSangpum(String sang, int su, int dan) {
		
		this.sang = sang;
		this.su = su;
		this.dan = dan;
		
	}

}
