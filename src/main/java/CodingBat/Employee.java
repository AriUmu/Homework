package CodingBat;

/**
 * Created by arina on 27.07.17.
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double selary;

    public Employee(String name, double selary) {
        this.name = name;
        this.selary = selary;
    }

    public String getName() {
        return name;
    }

    public double getSelary() {
        return selary;
    }

    public void raiseSelary(double percent){
        double raise = selary * percent / 100;
        selary += raise;
    }

    public int compareTo(Employee employee) {
        return Double.compare(selary, employee.selary);
    }

    @Override
    public String toString() {
        return "Name: " + name + " selary: " + selary;
    }

    public static void main(String[] args) {
        Employee [] staff = new Employee[5];

        staff[0] = new Employee("Herry", 3456.98);
        staff[1] = new Employee("Gatty", 3421.23);
        staff[2] = new Employee("Killo", 5643.21);
        staff[3] = new Employee("lilo", 4321.21);

        for(Employee num : staff){
            System.out.println(num.toString());
        }


    }
}


