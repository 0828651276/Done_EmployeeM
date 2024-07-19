public abstract class EmployeeM {

        private final String Id;
        private final String Name;
        private final int Age;
        private final String Phones;
        private final String Email;

        public EmployeeM(String Id, String Name, int Age, String Phones, String Email) {
            this.Id = Id;
            this.Name = Name;
            this.Age = Age;
            this.Phones = Phones;
            this.Email = Email;
        }

        public String getId() {
            return Id;
        }

        public String getName() {
            return Name;
        }

        public int getAge() {
            return Age;
        }

        public String getPhones() {
            return Phones;
        }

        public String getEmail() {
            return Email;
        }

        public double Payroll() {
            return 0;
        }

        @Override
        public String toString() {
            return "NhanVien{" +
                    "maNhanVien='" + Id + '\'' +
                    ", hoTen='" + Name + '\'' +
                    ", tuoi=" + Age +
                    ", soDienThoai='" + Phones + '\'' +
                    ", email='" + Email + '\'' +
                    '}';
        }
    }
