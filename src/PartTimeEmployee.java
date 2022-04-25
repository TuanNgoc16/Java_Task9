//session 7
//Snippet 7
public class PartTimeEmployee extends Employee {
String shift;
public PartTimeEmployee ( String id, String name, int sal,String shift){
    super(id, name, sal);
    this.shift=shift;
}
public void displayDetails (){
    calcCommission(12);
    super.displayDetails();
    System.out.println("Working shift: " + shift);
}


    public void main(String[] args){
        EmployeeDetails objEmp = new EmployeeDetails("E001","Maria",4000);
        //objEmp.calcCommssion(200F);
       // objEmp.displayDetails ();
        System.out.println("------------");
        Employee objEmp1 = new PartTimeEmployee("E001","rod",200,"Day");
        objEmp1.displayDetails();
    }

    private class EmployeeDetails {
        public EmployeeDetails(String e001, String maria, int i) {
        }
    }
}

