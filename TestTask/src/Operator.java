public class Operator extends Employee {

    private long fixSalary = (long) (Math.random()*100000);


    @Override
    public double getMonthSalary(Company company) {
        return fixSalary;
    }
}
