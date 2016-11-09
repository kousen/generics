package generics.max;

/**
 * Created by Ken Kousen on 11/9/16.
 */
public class Salaried extends Employee {
    private double salary;

    public Salaried(int id, String name) {
        super(id, name);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
