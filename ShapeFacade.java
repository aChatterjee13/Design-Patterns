package structural_facade;

public class ShapeFacade {

	private Shape circle;
	private Shape square;
	private Shape rectangle;
	public ShapeFacade() {
		circle=new Circle();
		square=new Square();
		rectangle=new Rectangle();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	public void drawRectangle(){
		rectangle.draw();
	}
	public void drawSquare(){
		square.draw();
	}
}
