package geometry;

public class Test {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.radius = 5.534;
		System.out.println("Alan 1: "+circle1.getArea());
		System.out.println("Çevre 1: "+circle1.getPerimeter());
		
		Circle circle2 = new Circle();
		circle2.setRadius(1/3.14);
		System.out.println("Alan 2: "+circle2.getArea());
		System.out.println("Çevre 2: "+circle2.getPerimeter());
	}

}
