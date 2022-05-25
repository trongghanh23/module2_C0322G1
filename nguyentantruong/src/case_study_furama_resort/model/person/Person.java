package case_study_furama_resort.model.person;

public abstract class Person {
    private String Name;
    private String Date;
    private String gender;
    private String idCar;
    private int numberPhone;
    private String email;

    public Person() {
    }

    public Person(String name, String date, String gender, String idCar, int numberPhone, String email) {
        Name = name;
        Date = date;
        this.gender = gender;
        this.idCar = idCar;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
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
                "Name='" + Name + '\'' +
                ", Date=" + Date +
                ", gender=" + gender +
                ", idCar='" + idCar + '\'' +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
