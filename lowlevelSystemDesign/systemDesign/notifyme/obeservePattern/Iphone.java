package systemDesign.notifyme.obeservePattern;

public class Iphone implements Observer{

	@Override
	public void update() {
		System.out.println("Iphone stock is available");
	}
	
}
