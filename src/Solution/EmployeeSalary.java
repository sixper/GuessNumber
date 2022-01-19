package Solution;

public class EmployeeSalary {


    public static class Employee{


        String name;
        double salary;
        double workHours;
        int hireYear;


        public Employee(String name, double salary, double workHours, int hireYear) {

            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;

        }


        public double tax(){

            if(salary < 1000)
                return 0;
            else
                return salary * 0.03;

        }


        public double bonus(){

            if(workHours > 40)
                return (workHours - 40) * 30;
            else
                return 0;

        }


        public double raiseSalary(){

            int val = 2021 - hireYear;

            if(val >= 20)
                return salary * 0.15;
            else if(val >= 10 && val <= 19)
                return salary * 0.1;
            else
                return salary * 0.05;



        }


        public String toString(){

            return "Name: " + this.name +
                    "\nSalary: " + this.salary +
                    "\nWorking Hours: " + (int)this.workHours +
                    "\nYear of start: " + (int)this.hireYear +
                    "\nTax: " + tax() +
                    "\nBonus: " + bonus() +
                    "\nSalary Raise: " + raiseSalary() +
                    "\nSalary with bonus: " + (salary + bonus() - tax()) +
                    "\nTotal Salary: " + (raiseSalary() + (salary + bonus() - tax()));

        }
    }



    public static void main(String[] args) {

        Employee onur = new Employee("ONUR ERMAN", 2000, 45, 1985);

        System.out.println(onur.toString());



    }




}



