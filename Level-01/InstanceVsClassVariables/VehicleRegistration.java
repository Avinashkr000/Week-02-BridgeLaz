package Instance;

class VehicleRegistration {

    private String ownerName;
    private String vehicleType;
    private static double registrationFee;

    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public static void main(String[] args) {
        VehicleRegistration vehicle1 = new VehicleRegistration("Avinash", "Bike");
        vehicle1.displayVehicleDetails();
        updateRegistrationFee(1000);
        vehicle1.displayVehicleDetails();
    }
}
