package case_study_furama_resort.libs.manage_person;

public class Customer extends Person{
    private String idCustomer;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String idCustomer, String customerType, String address) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, int date, boolean gender, int numberCar, int numberPhone, String email, String idCustomer, String customerType, String address) {
        super(name, date, gender, numberCar, numberPhone, email);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                super.toString()+
                '}';
    }
}
