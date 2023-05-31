package lowlevelSystemDesign.parkinglot;

public class HourCostStrategy implements CostStrategy{

	@Override
	public int costBasedOnTime(Ticket t) {
		System.out.println("Based Ticket Entry time HourCost strategy will work");
		return 0;
	}

}
