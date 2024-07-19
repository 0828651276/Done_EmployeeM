import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeManagement {



        private final List<EmployeeM> listEmployeeM = new ArrayList<>();

        public void addEmployeeM(EmployeeM employeeM) {
            listEmployeeM.add(employeeM);
        }

        public double Nature() {
            double sum = 0;
            for (EmployeeM nv : listEmployeeM) {
                sum += nv.Payroll();
            }
            return listEmployeeM.isEmpty() ? 0 : sum / listEmployeeM.size();
        }

        public List<EmployeeMFullTime> enumerate() {
            List<EmployeeMFullTime> End = new ArrayList<>();
            double luongTrungBinh = Nature();
            for (EmployeeM nv : listEmployeeM) {
                if (nv instanceof EmployeeMFullTime && nv.Payroll() < luongTrungBinh) {
                    End.add((EmployeeMFullTime) nv);
                }
            }
            return End;
        }

        public double enumerateParttime() {
            double sumpt = 0;
            for (EmployeeM nv : listEmployeeM) {
                if (nv instanceof EmployeeMPartTime) {
                    sumpt += nv.Payroll();
                }
            }
            return sumpt;
        }

        public List<EmployeeMFullTime> sortFulltime() {
            List<EmployeeMFullTime> fulltimeList = new ArrayList<>();
            for (EmployeeM nv : listEmployeeM) {
                if (nv instanceof EmployeeMFullTime) {
                    fulltimeList.add((EmployeeMFullTime) nv);
                }
            }
            fulltimeList.sort(Comparator.comparingDouble(EmployeeMFullTime::Payroll));
            return fulltimeList;
        }

        public static void main(String[] args) {
            EmployeeManagement quanLy = new EmployeeManagement();

            EmployeeMFullTime nv1 = new EmployeeMFullTime("NV01", "Nguyen Van A", 30, "0123456789", "a@gmail.com", 2000000, 500000, 10000000);
            EmployeeMFullTime nv2 = new EmployeeMFullTime("NV02", "Tran Van B", 28, "0123456790", "b@gmail.com", 1500000, 300000, 9000000);
            EmployeeMFullTime nv3 = new EmployeeMFullTime("NV03", "Tran Van D", 28, "0123456760", "e@gmail.com", 1200000, 320000, 12000000);
            EmployeeMPartTime nv4 = new EmployeeMPartTime("NV04", "Le Thi C", 22, "0123456791", "c@gmail.com", 120);
            EmployeeMPartTime nv5 = new EmployeeMPartTime("NVO5", "Le Thi D", 22, "0123426791", "f@gmail.com", 130);

            quanLy.addEmployeeM(nv1);
            quanLy.addEmployeeM(nv2);
            quanLy.addEmployeeM(nv3);
            quanLy.addEmployeeM(nv4);
            quanLy.addEmployeeM(nv5);

            System.out.println("Luong trung binh: " + quanLy.Nature());

            System.out.println("Nhan vien fulltime luong thap hon trung binh:");
            for (EmployeeMFullTime nv : quanLy.enumerate()) {
                System.out.println(nv);
            }

            System.out.println("Tong luong parttime: " + quanLy.enumerateParttime());

            System.out.println("Danh sach nhan vien fulltime theo luong tang dan:");
            for (EmployeeMFullTime nv : quanLy.sortFulltime()) {
                System.out.println(nv);
            }
        }



}
