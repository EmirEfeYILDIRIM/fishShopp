package fishShop;

public class Aquarium {
	private String name;
	private String color;
	private int cm;
	private int thickness;
	private double price;
	public Aquarium() {
		super();
	}
	public Aquarium(String name, String color, int cm, int thickness, double price) {
		super();
		this.name = name;
		this.color = color;
		this.cm = cm;
		this.thickness = thickness;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCm() {
		return cm;
	}
	public void setCm(int cm) {
		this.cm = cm;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printAquariumInfo() {
		System.out.print("İsim: "+this.getName()+" ");
		System.out.print("Rengi: "+this.getColor()+" ");
		System.out.print("Uzunluk: "+this.getCm()+"cm ");
		System.out.print("Yükseklik: "+this.getCm()+"cm ");
		System.out.print("Cam Kalınlığı: "+this.getThickness()+"cm ");
		System.out.println("Fiyat: "+this.getPrice()+" ");
	}
}
