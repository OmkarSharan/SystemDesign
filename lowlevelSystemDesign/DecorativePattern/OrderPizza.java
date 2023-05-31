package DecorativePattern;

public class OrderPizza {
	public static void main(String[] args) {
		BasePizza magrita = new Magrita();
		TopicDecorator topic = new ExtraChees(new ExtraChees(magrita));
		System.out.println(topic.price());
	}
}
