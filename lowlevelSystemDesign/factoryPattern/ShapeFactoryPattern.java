package factoryPattern;

public class ShapeFactoryPattern {
	public Shape getShape(String input) {
		switch(input){
		case "Circle":
			return new Circle();
		case "Retangle":
			return new Retangle();
		default:
			break;
			
	}
		return null;
	}
}
