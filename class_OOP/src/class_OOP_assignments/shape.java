package class_OOP_assignments;

public class shape {
	
	
	
	private double radius; 
	private double side; 
	
	
	
	
	public void set_Radius(double radius) {
		
		this.radius = radius; 
		
		  
	}
	
	public void set_side(double side) {
		
		this.side = side; 
		 
	}
	
	
	public double get_Circle_Area() {
      double area = Math.PI * (radius * radius);
		
		return area;
		
	}
	
	public double get_Square_Area() {
          double area = side*side;
		
		return area; 
			
		}
	
	
	
	


}
