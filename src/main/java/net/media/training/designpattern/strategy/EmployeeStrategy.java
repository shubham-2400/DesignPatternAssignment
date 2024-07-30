package net.media.training.designpattern.strategy;

public class EmployeeStrategy extends GenericEmployee{
    public int setSalary(int salary, int minSalary) {
        super.setSalary(salary);
        atLeast(salary, minSalary);
        return salary;
    }

    public int setMonthsSpent(int months, int minMonths) {
        super.setMonthsSpent(months);
        atLeast(months, minMonths);
        return months;
    }

    public int setMaxAllowedLeaves(int leaves,int minLeaves) {
        atLeast(leaves, minLeaves);
        return leaves;
    }

    public int setMaxBonus(int bonus, int minBonus){
        atLeast(bonus, minBonus);
        return bonus;
    }
}
