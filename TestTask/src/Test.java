import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Company VTB = new Company(10000000);

        ArrayList<Employee> list = new ArrayList<>();
        for (int i=0;i<180;i++) {
            list.add(new Operator());
        }
        for (int j=0;j<80;j++){
            list.add(new Manager());
        }
        for (int k=0;k<10;k++){
            list.add(new TopManager());
        }
        VTB.hireAll(list);
        for (int q=0;q<VTB.getTopSalaryStaff(10).size();q++){
            System.out.println((q+1)+"."+" " +VTB.getTopSalaryStaff(10).get(q).getMonthSalary(VTB) + " Рублей");
        }
        for (int t=0;t<VTB.getLowSalaryStaff(30).size();t++) {
            System.out.println((t+1)+"."+" " +VTB.getLowSalaryStaff(30).get(t).getMonthSalary(VTB)+" Рублей");
        }
        for (int f=0;f<(VTB.getEmployeeList().size())/2;f++){
            VTB.fire(VTB.getEmployeeList().get(f));
        }
        for (int q=0;q<VTB.getTopSalaryStaff(15).size();q++){
            System.out.println((q+1)+"."+" " +VTB.getTopSalaryStaff(15).get(q).getMonthSalary(VTB)+" Рублей");
        }
        for (int t=0;t<VTB.getLowSalaryStaff(30).size();t++) {
            System.out.println((t+1)+"."+" "+VTB.getLowSalaryStaff(30).get(t).getMonthSalary(VTB)+" Рублей");
        }






    }
}
