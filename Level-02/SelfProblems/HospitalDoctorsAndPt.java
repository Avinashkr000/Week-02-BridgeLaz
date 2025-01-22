package SelfProblems;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private final String name;
    private final List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.consult(this);
        }
    }

    public void viewDoctors() {
        System.out.println(name + " is consulting the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  - " + doctor.getName());
        }
    }
}

class Doctor {
    private final String name;
    private final List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            System.out.println(name + " is consulting with " + patient.getName());
        }
    }

    public void viewPatients() {
        System.out.println(name + " is consulting the following patients :");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName());
        }
    }
}

class Hospital {
    private final String hospitalName;
    private final List<Doctor> doctors;
    private final List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        for (Doctor doctor : doctors) {
            doctor.viewPatients();
        }
        for (Patient patient : patients) {
            patient.viewDoctors();
        }
    }
}

public class HospitalDoctorsAndPt {
    public static void main(String[] args) {
        Doctor drAvinash = new Doctor("Dr. Avinash");
        Doctor drKunal = new Doctor("Dr. Kunal");

        Patient abhisek = new Patient("Abhisek");
        Patient vikash = new Patient("vikash");

        Hospital hospital = new Hospital("City Hospital");

        hospital.addDoctor(drAvinash);
        hospital.addDoctor(drKunal);
        hospital.addPatient(abhisek);
        hospital.addPatient(vikash);

        abhisek.consult(drAvinash);
        vikash.consult(drKunal);
        abhisek.consult(drAvinash);

        hospital.showHospitalDetails();
    }
}
