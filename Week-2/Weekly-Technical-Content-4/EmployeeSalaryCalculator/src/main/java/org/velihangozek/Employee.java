package org.velihangozek;

public class Employee {
    private static final int CURRENT_YEAR = 2021;
    private static final double TAX_RATE = 0.03;
    private static final int TAX_THRESHOLD = 1000;
    private static final int REGULAR_HOURS = 40;
    private static final double BONUS_PER_HOUR = 30;

    private final String name;
    private final double salary;
    private final double workHours;
    private final int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        validate();
    }

    private void validate() {
        if (salary < 0)
            throw new IllegalArgumentException("Salary must be >= 0");
        if (workHours < 0)
            throw new IllegalArgumentException("Work hours must be >= 0");
        if (hireYear > CURRENT_YEAR)
            throw new IllegalArgumentException("Hire year cannot be in the future (Must be <= 2021)");
    }

    /**
     * @return the tax amount (0 if salary < 1000)
     */
    private double tax() {
        return salary < TAX_THRESHOLD
                ? 0
                : salary * TAX_RATE;
    }

    /**
     * @return the bonus amount (0 if workHours <= 40)
     */
    private double bonus() {
        return workHours > REGULAR_HOURS
                ? (workHours - REGULAR_HOURS) * BONUS_PER_HOUR
                : 0;
    }

    private double raiseSalary() {
        int workYears = CURRENT_YEAR - hireYear;
        double rateOfRaise = workYears < 10 ? 0.05
                           : workYears < 20 ? 0.10
                           : 0.15;
        return salary * rateOfRaise;
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raiseAmount = raiseSalary();
        double netSalary = salary - tax + bonus;
        double total = netSalary + raiseAmount;

        return String.format(
                "Name                : %s%n" +
                "Salary              : %.2f%n" +
                "Work Hours (weekly) : %.1f%n" +
                "Hire Year           : %d%n" +
                "Tax                 : %.2f%n" +
                "Bonus               : %.2f%n" +
                "Salary Increase     : %.2f%n" +
                "Salary w/ Tax+Bonus : %.2f%n" +
                "Total Salary        : %.2f",
                name, salary, workHours, hireYear, tax, bonus, raiseAmount, netSalary, total
        );
    }
}