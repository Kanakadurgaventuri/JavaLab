import java.util.Scanner;
abstract class Shape {
	abstract double calculateArea();
	abstract double calculatePerimeter();
	public void displayDetails()
	{
		System.out.println("Shape details:");
		System.out.println("Area: "+calculateArea());
		System.out.println("Perimeter: "+calculatePerimeter());
	}
}
class Main extends Shape {
    double radius;
    public Main(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
	return (3.141592653589793*radius*radius);
    }
    @Override
    double calculatePerimeter() {
	return (2*3.141592653589793*radius);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Main main  = new Main(radius);
        main.displayDetails();
        scanner.close();
    }
}
