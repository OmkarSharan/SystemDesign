package lowlevelSystemDesign.parkinglot;

public class MinuteCostStrategy implements CostStrategy{

	@Override
	public int costBasedOnTime(Ticket t) {
		System.out.println("Based on entry time on ticket price will get calculated");
		return 0;
	}

}
