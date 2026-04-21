import java.util.*;

// 🔹 Doctor Class
class Doctor {
    int doctorId;
    String name;
    String specialization;

    Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    // Assign doctor based on disease
    static int assignDoctor(String disease) {
        if (disease.equalsIgnoreCase("skin")) return 1;
        else if (disease.equalsIgnoreCase("heart")) return 2;
        else return 3;
    }

    static void viewDoctors(ArrayList<Doctor> doctors) {
        for (Doctor d : doctors) {
            System.out.println(d.doctorId + " " + d.name + " " + d.specialization);
        }
    }
}

// 🔹 Patient Class
class Patient {
    int patientId;
    String name;
    String disease;
    int doctorId;

    Patient(int patientId, String name, String disease, int doctorId) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
        this.doctorId = doctorId;
    }

    static void viewPatients(ArrayList<Patient> patients) {
        for (Patient p : patients) {
            System.out.println(p.patientId + " " + p.name + " Disease:" + p.disease + " DoctorID:" + p.doctorId);
        }
    }
}

// 🔹 Ward Class
class Ward {
    int wardId;
    String wardType;
    int patientId;

    Ward(int wardId, String wardType, int patientId) {
        this.wardId = wardId;
        this.wardType = wardType;
        this.patientId = patientId;
    }

    static void viewWards(ArrayList<Ward> wards) {
        for (Ward w : wards) {
            System.out.println(w.wardId + " " + w.wardType + " PatientID:" + w.patientId);
        }
    }
}

// 🔹 Bill Class
class Bill {
    int billId;
    int patientId;
    double amount;

    Bill(int billId, int patientId, double amount) {
        this.billId = billId;
        this.patientId = patientId;
        this.amount = amount;
    }

    static void viewBills(ArrayList<Bill> bills) {
        for (Bill b : bills) {
            System.out.println(b.billId + " PatientID:" + b.patientId + " Amount:" + b.amount);
        }
    }
}

// 🔹 Main Class
public class HospitalManagement {

    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Ward> wards = new ArrayList<>();
    static ArrayList<Bill> bills = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        addDoctors();   // preload doctors
        menu();         // start system
    }

    // 🔹 Add Doctors
    static void addDoctors() {
        doctors.add(new Doctor(1, "Dr.Smith", "Dermatologist"));
        doctors.add(new Doctor(2, "Dr.John", "Cardiologist"));
        doctors.add(new Doctor(3, "Dr.Anna", "General"));
    }

    // 🔹 Menu
    static void menu() {
        int choice;

        do {
            System.out.println("\n--- HOSPITAL MANAGEMENT ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. View Doctors");
            System.out.println("4. Add Ward");
            System.out.println("5. View Wards");
            System.out.println("6. Add Bill");
            System.out.println("7. View Bills");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            processChoice(choice);

        } while (choice != 8);
    }

    // 🔹 Handle choices
    static void processChoice(int choice) {
        switch (choice) {
            case 1: addPatient(); break;
            case 2: Patient.viewPatients(patients); break;
            case 3: Doctor.viewDoctors(doctors); break;
            case 4: addWard(); break;
            case 5: Ward.viewWards(wards); break;
            case 6: addBill(); break;
            case 7: Bill.viewBills(bills); break;
            case 8: System.out.println("Exiting..."); break;
            default: System.out.println("Invalid choice!");
        }
    }

    // 🔹 Add Patient
    static void addPatient() {
        System.out.print("Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Disease: ");
        String disease = sc.nextLine();

        int doctorId = Doctor.assignDoctor(disease);

        patients.add(new Patient(id, name, disease, doctorId));

        System.out.println("Patient added! Doctor ID: " + doctorId);
    }

    // 🔹 Add Ward
    static void addWard() {
        System.out.print("Ward ID: ");
        int wid = sc.nextInt();
        sc.nextLine();

        System.out.print("Ward Type: ");
        String type = sc.nextLine();

        System.out.print("Patient ID: ");
        int pid = sc.nextInt();

        wards.add(new Ward(wid, type, pid));

        System.out.println("Ward assigned!");
    }

    // 🔹 Add Bill
    static void addBill() {
        System.out.print("Bill ID: ");
        int bid = sc.nextInt();

        System.out.print("Patient ID: ");
        int pid = sc.nextInt();

        System.out.print("Amount: ");
        double amt = sc.nextDouble();

        bills.add(new Bill(bid, pid, amt));

        System.out.println("Bill generated!");
    }
}