package Overriding;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("In Class Square ");
	}

	@Override
	public void draw1() {
		System.out.println("In Class Square draw1 ");
	}
	
}
