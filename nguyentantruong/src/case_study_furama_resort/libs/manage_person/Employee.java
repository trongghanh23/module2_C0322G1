package case_study_furama_resort.libs.manage_person;

public class Employee extends Person{
    private String idEmployee;
    private String level;
    private String location;
    private double salary;

    public Employee() {
    }

    public Employee(String idEmployee, String level, String location, double salary) {
        this.idEmployee = idEmployee;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String name, int date, boolean gender, int numberCar, int numberPhone, String email, String idEmployee, String level, String location, double salary) {
        super(name, date, gender, numberCar, numberPhone, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                super.toString()+
                '}';
    }
}
