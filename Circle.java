class Circle {
    double radius;

    // constructor
    Circle(double r) {
        radius = r;
    }

    // method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area of Circle: " + c.area());
    }
}

