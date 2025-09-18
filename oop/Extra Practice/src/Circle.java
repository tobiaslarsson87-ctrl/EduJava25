public class Circle {
    double radius;
    //Construct
    Circle(double radius) {
        this.radius = radius;
    }
    //Methods
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}