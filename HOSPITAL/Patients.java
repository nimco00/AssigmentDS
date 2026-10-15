package HOSPITAL;
class Patient{ //supar class patient
    public String Name;
    public double CalculateFee;
    public Patient( String Name,double CalculateFee){
        this.Name=Name;
        this.CalculateFee=CalculateFee;
    }
    public  void displayinfo(){
        System.out.println("Name: "+ Name);
        System.out.println("CalculateFee $ " + CalculateFee);
    }
//     public static void Main(String[] args){
//         Patient p= new Patient("Ahmed",50);
//         p.displayinfo();
//     }
}
//subclass Inpatient
class Inpatient extends Patient{
    private   double RoomCharge;
    private int Numberofdays;
    public Inpatient(String Name,double CalculateFee,
                     double RoomCharge,int Numberofdays) {
        super(Name,CalculateFee);
        this.RoomCharge=RoomCharge;
        this.Numberofdays=Numberofdays;
    }
    public double CalculateBill(){
        return (Numberofdays * RoomCharge)+CalculateFee;
    }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Roomcharge berday $"+RoomCharge);
        System.out.println("Numberofdays :"+Numberofdays);
        System.out.println("CulculateBill:"+CalculateBill());
    }

}

//subclass Outpatient
class Outpatient extends Patient{
    private double labcharge;

    public Outpatient(String Name, double CalculateFee, double labcharge){
        super(Name,CalculateFee);
        this.labcharge=labcharge;
    }
    public  double CalculateBill(){
        return labcharge+CalculateFee;
    }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("labcharge $"+labcharge);
        System.out.println("CalculateBill :"+CalculateBill());
    }
}

public class Patients {
static void main(){
    Inpatient p1=new Inpatient("Naima",30,14,50);
    System.out.println("Inpatient:");
    p1.displayinfo();
    System.out.println();
    Outpatient p2=new Outpatient("Aisha",20,7);
    System.out.println("Outpatient");
    p2.displayinfo();
}
}
