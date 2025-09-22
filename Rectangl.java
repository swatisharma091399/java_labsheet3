class Rectangl {
    int width, height;

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 10;
        r.height = 5;
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}

