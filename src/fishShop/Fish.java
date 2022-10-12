package fishShop;

public class Fish {
	private String name;
	private String color;
	private String lifeTime;
	public Fish() {
		super();
	}
	public Fish(String name, String color, String lifeTime) {
		super();
		this.name = name;
		this.color = color;
		this.lifeTime = lifeTime;
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
	public String getLifeTime() {
		return lifeTime;
	}
	public void setLifeTime(String lifeTime) {
		this.lifeTime = lifeTime;
	}
	public void printFishInfo() {
		System.out.print("İsim: "+this.getName()+" ");
		System.out.print("Rengi: "+this.getColor()+" ");
		System.out.println("Ömrü: "+this.getLifeTime()+" ");
	}
}
