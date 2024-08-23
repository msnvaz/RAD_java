class Car {
    String model;
    String make;
    int year;

    Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Model: " + model + ", Make: " + make + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Model S", "Tesla", 2021);
        Car car2 = new Car("Civic", "Honda", 2020);
        Car car3 = new Car("Mustang", "Ford", 2022);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
