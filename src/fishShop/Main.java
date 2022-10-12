package fishShop;

public class Main {

	public static void main(String[] args) {
		Fish fs1=new Fish();
		Rod rd1=new Rod();
		Bait bt1=new Bait();
		Aquarium aq1=new Aquarium();
		Fish fs2=new Fish();
		Rod rd2=new Rod();
		Bait bt2=new Bait();
		Aquarium aq2=new Aquarium();
		
		fs1.setName("Japon Balığı");
		fs1.setColor("Turuncu");
		fs1.setLifeTime("5");
		rd1.setMarka("Shimano Fx 4000 Fx Xt");
		rd1.setCm(270);
		rd1.setWeight("14-40");
		rd1.setPrice(1.362);
		bt1.setMarka("Ahm Guppy Granulat Lepistes Balık Yemi");
		bt1.setGr(250);
		bt1.setPrice(45.0);
		aq1.setName("Kanki Pet Renkli Kapak Mini Akvaryum");
		aq1.setColor("Siyah");
		aq1.setCm(30);
		aq1.setThickness(4);
		aq1.setPrice(200);
		fs2.setName("Vatos");
		fs2.setColor("Kahverengi");
		fs2.setLifeTime("5");
		rd2.setMarka("Remixon Apache");
		rd2.setCm(360);
		rd2.setWeight("250");
		rd2.setPrice(538.8);
		bt2.setMarka("Royalist Aqua Pellet Japon Balığı Yemi");
		bt2.setGr(100);
		bt2.setPrice(58.1);
		aq2.setName("Paşabahçe Cam Fanus");
		aq2.setColor("Şeffaf");
		aq2.setCm(20);
		aq2.setThickness(2);
		aq2.setPrice(175.0);
		
		fs1.printFishInfo();
		fs2.printFishInfo();		
		rd1.printRodInfo();
		rd2.printRodInfo();
		bt1.printBaitInfo();
		bt2.printBaitInfo();
		aq1.printAquariumInfo();
		aq2.printAquariumInfo();
	}

}
