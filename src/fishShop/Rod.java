package fishShop;

public class Rod {
	private String marka;
	private int cm;
	private String weight;
	private double price;
	public Rod() {
		super();
	}
	public Rod(String marka, int cm, String weight) {
		super();
		this.marka = marka;
		this.cm = cm;
		this.weight = weight;
	}
	public Rod(String marka, int cm, String weight, double price) {
		super();
		this.marka = marka;
		this.cm = cm;
		this.weight = weight;
		this.price = price;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getCm() {
		return cm;
	}
	public void setCm(int cm) {
		this.cm = cm;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printRodInfo() {
		System.out.print("Marka: "+this.getMarka()+" ");
		System.out.print("CM: "+this.getCm()+"cm ");
		System.out.print("Ağırlık: "+this.getWeight()+"gr ");
		System.out.println("Fiyat: "+this.getPrice()+" ");
	}
}
