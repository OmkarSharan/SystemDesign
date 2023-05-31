package lowlevelSystemDesign.parkinglot;

public class TwoWheelerCost implements PriceManager{
	CostStrategy costStrategy;
	TwoWheelerCost(CostStrategy costStrategy){
		this.costStrategy = costStrategy;
	}
	
	@Override
	public int cost(Ticket ticket) {
		return 10 + costStrategy.costBasedOnTime(ticket);
	}

}
