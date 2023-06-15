/*
Class Attributes:
name: Name and surname of the employee
salary: Salary of the employee
workHours: Weekly working hours of the employee
hireYear: Year when the employee started working
*/
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double raiseSalary;

    // Employee(name, salary, workHours, hireYear): Constructor method that takes 4 parameters.
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /*
   Calculates the tax applied to the salary.
   If the employee's salary is less than 1000 TL, no tax will be applied.
   If the employee's salary is greater than 1000 TL, a tax of 3% of the salary will be applied.
   */
    double tax() {
        if(salary < 1000){
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    /*
    Calculates the bonus amount if the employee worked more than 40 hours per week.
    The bonus amount will be 30 TL per hour for each extra hour worked.
    */
    double bonus() {
        if(workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    /*
    Calculates the salary increase based on the employee's hire year. The current year is assumed to be 2021.
    If the employee has been working for less than 10 years, a 5% raise will be applied to their salary.
    If the employee has been working for more than 9 years and less than 20 years, a 10% raise will be applied.
    If the employee has been working for more than 19 years, a 15% raise will be applied.
    */
    double raiseSalary(){
        if(2023-hireYear<10){
            raiseSalary =  (salary*=0.05);
        }
        else if(2023-hireYear>=10 && 2023-hireYear<20){
            raiseSalary =  (salary*=0.10);
        }
        else{
            raiseSalary =  (salary*=0.15);
        }
        return raiseSalary;
    }

    // toString(): Prints the employee's information to the screen.
    void printInfo(){
        System.out.println("------------------------");

        System.out.println("Name\t\t:" + this.name);
        System.out.println("Salary\t\t:" + this.salary);
        System.out.println("Work Hours\t:" + this.workHours);
        System.out.println("Hire Years\t:" + this.hireYear);

        System.out.println("------------------------");

        System.out.println("Salary with Tax and Bonus: "  + (this.salary + this.raiseSalary - this.tax()));
        System.out.println("Total Salary: " + (this.salary + this.bonus() + this.raiseSalary - this.tax()));

        System.out.println("------------------------");

        System.out.println("Tax\t\t\t:" + this.tax());
        System.out.println("Bonus\t\t:" + this.bonus());
        System.out.println("Salary Increase:" + this.raiseSalary());

    }
}

