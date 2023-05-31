package DecorativePattern;

public class TopicDecorator extends BasePizza{
	BasePizza basePizza;
	TopicDecorator(BasePizza basePizza){
		this.basePizza = basePizza;
	}
	public int price() {
		return basePizza.price();
	}
}
