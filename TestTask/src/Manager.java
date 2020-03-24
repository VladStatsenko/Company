public class Manager extends Employee {

    private long fixSalary = (long) (Math.random()*100000);
    private static final double PERCENT_OF_INCOME = 0.05;

    @Override
    public double getMonthSalary(Company company) {
        return fixSalary+PERCENT_OF_INCOME*company.getIncome();
    }
}
