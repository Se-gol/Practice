package Lessons;

public class Objects {
    //How do you create an Object?

    //Simple, just create a class:
    public static class Car {
        // Assign properties to it:
        private String model;
        private int productionYear;

        // Initialize the object when user creates it (The Constructor *DUM DUM DUM* [kind of like a function]):
        public Car(String model, int productionYear) {
            this.model = model;
            this.productionYear = productionYear;
        }

        // Assign getters and setters to be able to use and configure the object's properties:

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getProductionYear() {
            return productionYear;
        }

        public void setProductionYear(int productionYear) {
            this.productionYear = productionYear;
        }

        // Special printing:

        public String toString() {
            return "model " + this.model + ", production year: " + this.productionYear;
        }

        // Assign more useful functions:

        public boolean isModern(int currentYear) {
            if (currentYear - this.productionYear <= 5) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        // How do you use an object?

        // Create it:
        Car car = new Car("Toyota", 2001);

        // Print the properties: (this calls toString()).
        System.out.println(car);

        // Get individual properties:
        System.out.println(car.getModel());
        System.out.println(car.getProductionYear());

        // Set individual properties:
        car.setModel("Ford");
        car.setProductionYear(2014);

        if (car.isModern(2021)) {
            System.out.println("Car is modern!");
        } else {
            System.out.println("Car isn't modern.");
        }

        // Create as much as you want:

        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Audi", 2020);
        Car car3 = new Car("Tesla", 2017);

        // From Constants:
        System.out.println(Constants.DAYS_IN_A_YEAR);
        System.out.println(Constants.PI);
    }

    // You can also use Classes to store constants:

    public static class Constants {
        public static double PI = 3.14159265359;
        public static int DAYS_IN_A_YEAR = 365;
    }
}
