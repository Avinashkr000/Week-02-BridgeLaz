class Vehicle {
    static double registrationFee = 100.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: " + Vehicle.registrationFee);
        } else {
            System.out.println("This is not a valid Vehicle object.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Avinash", "Car", "ABCD123");
        Vehicle vehicle2 = new Vehicle("Suraj", "Motorcycle", "ABCDE25420");

        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();

        updateRegistrationFee(150.0);  // Update the registration fee for all vehicles
        System.out.println("\nAfter updating the registration fee:\n");

        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}
