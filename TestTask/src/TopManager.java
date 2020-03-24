public class TopManager extends Employee {

    private long fixSalary = (long) (Math.random()*100000);
    private static final double BONUS_PERCENT = 1.5;
    private static final int BONUS_INCOME = 10000000;

    @Override
    public double getMonthSalary(Company company) {
        if (company.getIncome() > BONUS_INCOME) {
            return fixSalary + fixSalary * BONUS_PERCENT;
        } else {
            return fixSalary;
        }
    }
}
