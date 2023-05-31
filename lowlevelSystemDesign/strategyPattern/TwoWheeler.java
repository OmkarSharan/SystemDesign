package strategyPattern;

public class TwoWheeler extends Vehicle{
	TwoWheeler() {
		super(new NormalDriveStrategy());
	}
}
