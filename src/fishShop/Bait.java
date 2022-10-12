package fishShop;

public class Bait {
	private String marka;
	private int gr;
	private String fish;
	private double price;
	public Bait() {
		super();
	}
	public Bait(String marka, int gr, String fish) {
		super();
		this.marka = marka;
		this.gr = gr;
		this.fish = fish;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getGr() {
		return gr;
	}
	public void setGr(int gr) {
		this.gr = gr;
	}
	public String getFish() {
		return fish;
	}
	public void setFish(String fish) {
		this.fish = fish;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printBaitInfo() {
		System.out.print("Marka: "+this.getMarka()+" ");
		System.out.print("Gramaj: "+this.getGr()+"gr ");
		System.out.print("Şu Balıklar Yer: "+this.getFish()+" ");
		System.out.println("Fiyat: "+this.getPrice()+" ");
	}	
}
