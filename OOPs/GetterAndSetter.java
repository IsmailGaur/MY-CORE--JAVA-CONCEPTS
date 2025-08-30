class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be grrater than 0 ");
        }
    }
}

public class GetterAndSetter {
    public static void main(String args[]) {
        Employee emp = new Employee();

        emp.setName("ismail azeem");
        emp.setSalary(90000);

        System.out.println(" Employee Namez: " + emp.getName());
        System.out.println(" Employee salary : " + emp.getSalary());
    }

}
