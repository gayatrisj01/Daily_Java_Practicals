/*Q. . Write a class with the name Perimeter using function overloading that computes the perimeter of a square,
  a rectangle and a circle.
 */
public class Perimeter {

    // Compute perimeter of a square
    public double calculatorPerimeter(double side) {
        return 4 * side;
    }

    // Compute perimeter of a rectangle
    public double calPerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Compute perimeter of a circle
    public double calPerimeter(double radius) {
        return 2 * (22.0 / 7) * radius;
    }

    public static void main(String[] args) {
        Perimeter perimeterCalculator = new Perimeter();

        // Example usage
        double side = 5;
        double length = 6;
        double width = 4;
        double radius = 3;

        System.out.println("Perimeter of square with side " + side + ": " + perimeterCalculator.calculatorPerimeter(side));
        System.out.println("Perimeter of rectangle with length " + length + " and width " + width + ": " + perimeterCalculator.calPerimeter(length, width));
        System.out.println("Perimeter of circle with radius " + radius + ": " + perimeterCalculator.calPerimeter(radius));
    }
}

/*
Output :-
Perimeter of square with side 5.0: 20.0
Perimeter of rectangle with length 6.0 and width 4.0: 20.0
Perimeter of circle with radius 3.0: 18.857142857142858
*/