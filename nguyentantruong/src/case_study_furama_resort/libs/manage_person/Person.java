package case_study_furama_resort.libs.manage_person;

public abstract class Person {
    private String name;
    private int date;
    private boolean gender;
    private int numberCar;
    private int numberPhone;
    private String email;

    public Person() {
    }

    public Person(String name, int date, boolean gender, int numberCar, int numberPhone, String email) {

        this.name = name;
        this.date = date;
        this.gender = gender;
        this.numberCar = numberCar;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", gender=" + gender +
                ", numberCar=" + numberCar +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
