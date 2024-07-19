public class EmployeeMFullTime extends EmployeeM {
          double Bonus;
          double Fine;
         double HardSalary;

        public EmployeeMFullTime(String Id, String Name, int Age, String Phones, String Email,
                                double Bonus, double Fine, double HardSalary) {
            super(Id, Name, Age, Phones, Email);
            this.Bonus = Bonus;
            this.Fine = Fine;
            this.HardSalary = HardSalary;
        }

        @Override
        public double Payroll() {
            return HardSalary + (Bonus - Fine);
        }

        public double getPayroll() {
            return HardSalary;
        }
    }

