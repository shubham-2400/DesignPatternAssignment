package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends GenericEmployee {
    private int setMaxBonus;
    private EmployeeStrategy employeeStrategy = new EmployeeStrategy();
    @Override
    public void setSalary(int salary) {
        this.salary = employeeStrategy.setSalary(salary, 200);
        // super.setSalary(salary);
        // atLeast(salary, 200);
        // this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        this.monthsSpent = employeeStrategy.setMonthsSpent(months, 60);
        // super.setMonthsSpent(months);
        // atLeast(months, 60);
        // this.monthsSpent = months;
    }

    public void setMaxBonus(int bonus) {
        this.setMaxBonus = employeeStrategy.setMaxBonus(bonus, 1);
        // atLeast(bonus, 1);
        // this.setMaxBonus = bonus;
    }
}
