package DecorativePattern;

public class ExtraChees extends TopicDecorator{

	BasePizza base;
	ExtraChees(BasePizza basePizza) {
		super(basePizza);
		this.base = basePizza;
	}
	public int price() {
		return base.price() + 35;
	}

}
