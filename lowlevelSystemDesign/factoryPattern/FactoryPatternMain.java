package factoryPattern;

public class FactoryPatternMain {
	public static void main(String [] args) {
		ShapeFactoryPattern fact = new ShapeFactoryPattern();
		Shape shape = fact.getShape("Circle");
		shape.draw();
	}
}	
