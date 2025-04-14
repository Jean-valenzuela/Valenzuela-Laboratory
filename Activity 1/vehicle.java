import java.util.Scanner;

public class vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    public vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
    public static void main(String[] args) {
        Scanner eya = new Scanner(System.in);
        String option;

        do {
            System.out.print("Enter the type of vehicle ([a] car / [b] motorcycle): ");
            option = eya.nextLine();

            if (option.equalsIgnoreCase("a")) {
                System.out.print("Enter the brand: ");
                String carBrand = eya.nextLine();

                System.out.print("Enter the speed: ");
                int carSpeed = eya.nextInt();
                eya.nextLine(); 

                System.out.print("Enter the fuel type: ");
                String carFuelType = eya.nextLine();

                System.out.print("Enter the number of doors: ");
                int numDoors = eya.nextInt();
                eya.nextLine(); 

                car car = new car(carBrand, carSpeed, carFuelType, numDoors);
                car.displayInfo();

            } else if (option.equalsIgnoreCase("b")) {
                System.out.print("Enter the brand: ");
                String bikeBrand = eya.nextLine();

                System.out.print("Enter the speed: ");
                int bikeSpeed = eya.nextInt();
                eya.nextLine(); 

                System.out.print("Enter the fuel type: ");
                String bikeFuelType = eya.nextLine();

                System.out.print("Does it have a sidecar? [yes or none]: ");
                boolean hasSidecar = eya.nextBoolean();
                eya.nextLine(); 

                motorcycle motorcycle = new motorcycle(bikeBrand, bikeSpeed, bikeFuelType, hasSidecar);
                motorcycle.displayInfo();

            } else {
                System.out.println("Invalid option. Please enter 'a' for car or 'b' for motorcycle.");
            }

            System.out.print("Do you want to enter another vehicle? (yes/no): ");
            option = eya.nextLine();

        } while (option.equalsIgnoreCase("yes"));

        eya.close();
            System.out.println("Program complete.");

}
}
//car subclass
    class car extends vehicle {
    private int numDoors;

        public car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

//motorcycle subclass
    class motorcycle extends vehicle {
    private boolean hasSidecar;

    public motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar? [yes or none]: " + hasSidecar);
    }
}
