public class EmployeeMPartTime extends EmployeeM{
     int HoursWorking;

    public EmployeeMPartTime(String Id, String Name, int Age, String Phones, String Email, int HoursWorking) {
        super(Id, Name, Age, Phones, Email);
        this.HoursWorking = HoursWorking;
    }

    @Override
    public double Payroll() {
        return HoursWorking * 100000;
    }
}
