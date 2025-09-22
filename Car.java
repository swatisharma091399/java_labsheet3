class Car {
    String model;
    int speed;

    Car setModel(String m) {
        model = m;
        return this;   // return current object
    }

    Car setSpeed(int s) {
        speed = s;
        return this;
    }

    Car showDetails() {
        System.out.println("Car Model: " + model + ", Speed: " + speed + " km/h");
        return this;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Honda City")
         .setSpeed(120)
         .showDetails();
    }
}

