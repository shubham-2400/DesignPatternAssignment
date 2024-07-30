package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:31:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends GenericEmployee {
    private int maxAllowedLeaves;
    private EmployeeStrategy employeeStrategy = new EmployeeStrategy();
    @Override
    public void setSalary(int salary) {
        this.salary = employeeStrategy.setSalary(salary, 0);
        // super.setSalary(salary);
        // this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        this.monthsSpent = employeeStrategy.setMonthsSpent(months, 0);
        // super.setMonthsSpent(months);
        // this.monthsSpent = months;
    }

    public void setMaxAllowedLeaves(int leaves) {
        this.maxAllowedLeaves = employeeStrategy.setMaxAllowedLeaves(leaves,1);
        // atLeast(leaves, 1);
        // this.maxAllowedLeaves = leaves;
    }
}

