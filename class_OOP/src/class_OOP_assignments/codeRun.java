package class_OOP_assignments;

public class codeRun {

	public static void main(String[] args) {
		
		shape square = new shape(); 
		shape circle = new shape(); 
		
		square.set_side(10);
		circle.set_Radius(5);
		
		System.out.println(square.get_Square_Area());
		System.out.println(circle.get_Circle_Area());

	}

}
