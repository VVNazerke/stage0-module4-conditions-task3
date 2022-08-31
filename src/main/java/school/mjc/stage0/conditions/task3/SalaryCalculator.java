package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double new_salary;
        if (salary < 0)
            System.out.println("wrong input!");
        else if (salary <= 10000) {
            new_salary = salary - salary * 0.15;
            System.out.println(new_salary);
        } else if (salary > 10000 && salary <= 20000) {
            new_salary = salary - salary * 0.18;
            System.out.println(new_salary);
        } else {
            new_salary = salary - salary * 0.2;
            System.out.println(new_salary);
        }

    }
}
