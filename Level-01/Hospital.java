class Patient {
    static String hospitalName = "General Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String disease;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.disease = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Disease: " + this.disease);
            System.out.println("Patient ID: " + this.patientID);
            System.out.println("Hospital Name: " + Patient.hospitalName);
        } else {
            System.out.println("This is not a valid Patient object.");
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Avinash", 22, "High SGPT", 101);
        Patient patient2 = new Patient("Rajan", 21, "Dengue", 102);

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        getTotalPatients();
    }
}
