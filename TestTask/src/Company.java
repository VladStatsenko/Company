import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {

    private double income;
    ArrayList<Employee> EmployeeList = new ArrayList<>();
    Comparator<Employee> comparator = Comparator.comparing(employee -> employee.getMonthSalary(this));

    public boolean hire(Employee employee) {
        EmployeeList.add(employee);
        return true;
    }

    public Company(double income) {
        this.income = income;
    }

    public ArrayList<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public void hireAll(List<Employee> list) {
        EmployeeList.addAll(list);
    }

    public void fire(Employee employee) {
        EmployeeList.remove(employee);
    }

    public double getIncome() {
        return income;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> topSalary = new ArrayList<>();
        Collections.sort(EmployeeList, comparator.reversed());
        if (EmployeeList.size() < count) {
            topSalary.addAll(EmployeeList);
        } else {
            for (int i = 0; i < count; i++) {
                topSalary.add(EmployeeList.get(i));
            }
        }
        return topSalary;
    }

    public ArrayList<Employee> getLowSalaryStaff(int count) {
        ArrayList <Employee> lowSalary = new ArrayList<>();
        Collections.sort(EmployeeList, comparator);
        if (EmployeeList.size() < count) {
            lowSalary.addAll(EmployeeList);
        } else {
            for (int i = 0; i < count; i++) {
                lowSalary.add(EmployeeList.get(i));
            }
        }
        return lowSalary;
    }

}

