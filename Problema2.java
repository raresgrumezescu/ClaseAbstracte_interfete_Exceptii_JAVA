package laborator6;

public class Problema2 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		//Rectangle r2 = new Shape();
		//System.out.println(r2 instanceof Rectangle);
		Rectangle r3 = new Square();
		Square s1 = new Square();
		Rectangle r4 = (Rectangle)s1;
		Square s2 = (Square)s1;
		//Circle c = (Circle)s1;
		//System.out.println(c instanceof Circle);
		
		Circle c1 = new Circle();
		//Square sq = (Square) c1;
		//System.out.println(sq instanceof Square);
		//Conversie 2
		Rectangle r = new Rectangle(5.0, 5.0);
		Square sq = new Square();
		sq = (Square) r;
		//Conversie 3
		sq = new Square(7.0);
		r = sq;
	}

}
