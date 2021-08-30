package lab7;

public class Cone 
{
		private double radius;
		private double height;
		
		public Cone(double radius, double height)
		{
			this.radius = radius;
			this.height = height;
		}
		
		public double calculateVolume()
		{
			return (Math.PI * radius * radius * height)/3.0;
		}
		
		public double calculateArea()
		{
			return (Math.PI * radius * radius) + (Math.sqrt(radius * radius + height * height) * Math.PI * radius);
		}
		

}
