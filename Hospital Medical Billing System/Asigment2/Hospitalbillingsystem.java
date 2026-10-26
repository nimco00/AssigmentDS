package Asigment2;
// Abstract Parent Class
abstract class MedicalService {
    protected String serviceId;
    protected String serviceName;
    protected double baseCost;
    double Totalcost;

    // Constructor
    MedicalService(String serviceId, String serviceName, double baseCost) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.baseCost = baseCost;
    }

    // Abstract Method
    public abstract void calculateTotalCost();

    // Concrete Method
    public void displayServiceInfo() {
        calculateTotalCost();

        System.out.println("Service ID: " + serviceId);
        System.out.println("Service: " + serviceName);
        System.out.println("Total Cost: $" + Totalcost);
        System.out.println();
    }
}

// Consultation Subclass
class Consultation extends MedicalService {
    double doctorFee;

    Consultation(String serviceId, String serviceName,double baseCost, double doctorFee) {
        super(serviceId,serviceName, baseCost);
        this.doctorFee = doctorFee;
    }

    @Override
    public void calculateTotalCost() {
        Totalcost = baseCost + doctorFee;
    }
}

// LaboratoryTest Subclass
class LaboratoryTest extends MedicalService {
    private double testCharge;

    public LaboratoryTest(String serviceId,String serviceName, double baseCost, double testCharge) {
        super(serviceId,serviceName,baseCost);
        this.testCharge = testCharge;
    }

    @Override
    public void calculateTotalCost() {
        Totalcost = baseCost + testCharge;
    }
}

// Ultrasound Subclass
class Ultrasound extends MedicalService {
    double additionalFee;

    Ultrasound(String serviceId,String serviceName, double baseCost, double additionalFee) {
        super(serviceId, serviceName, baseCost);
        this.additionalFee = additionalFee;
    }

    @Override
    public void calculateTotalCost() {
        Totalcost = baseCost + additionalFee;
    }
}
public class Hospitalbillingsystem {
    static void main(){
        // Create Objects
        MedicalService s1 = new Consultation("s002","hussen",9.00,15);
        MedicalService s2 = new LaboratoryTest("S002", "Hussen yusuf", 10.00,9);
        MedicalService s3 = new Ultrasound("S003", "Aisha Ahmed", 19.00,7);

        // Display Hospital Billing System
        System.out.println("===== HOSPITAL BILLING SYSTEM =====");

        s1.displayServiceInfo();
        s2.displayServiceInfo();
        s3.displayServiceInfo();

        // Calculate Total Hospital Bill
        s1.calculateTotalCost();
        s2.calculateTotalCost();
        s3.calculateTotalCost();

        double totalBill = s1.Totalcost + s2.Totalcost + s3.Totalcost;

        System.out.println("------------------------------");
        System.out.println("Total Hospital Bill: $" + totalBill);
    }
}

