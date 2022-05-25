package case_study_furama_resort.model.person;

public class Employee extends Person{
    private String level;
    private String location;
    private double salary;

    public Employee() {
    }

    public Employee(String level, String location, double salary) {
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String name, String date, String gender, String idCar, int numberPhone, String email, String level, String location, double salary) {
        super(name, date, gender, idCar, numberPhone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                super.toString()+
                '}';
    }
}
