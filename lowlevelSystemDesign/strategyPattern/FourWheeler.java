package strategyPattern;

public class FourWheeler extends Vehicle{
	FourWheeler() {
		super(new SpecialDriveStrategy());
	}
}
