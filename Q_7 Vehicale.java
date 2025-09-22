class Vehicle {
    int speed;
    String color;

    Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    void display() {
        System.out.println("Speed: " + speed + " km/h, Color: " + color);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(120, "Red");
        Vehicle v2 = new Vehicle(80, "Blue");

        v1.display();
        v2.display();
    }
}

