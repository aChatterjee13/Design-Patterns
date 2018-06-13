package structural_facade;

public class Tester {

	public static void main(String[] args) {
		ShapeFacade shapeFacade = new ShapeFacade();
		shapeFacade.drawCircle();
		shapeFacade.drawRectangle();
		shapeFacade.drawSquare();
	}
}
