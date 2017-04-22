package Overriding;

public class Over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape sh = new Circle();
		sh.draw();
		sh.draw1();
		Shape sh1 = new Square();
		sh1.draw();
		//Shape sh2 = new Shape();
		
	}
}
