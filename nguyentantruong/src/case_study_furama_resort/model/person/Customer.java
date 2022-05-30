package case_study_furama_resort.model.person;

public class Customer extends Person {
    private String idCustomer;
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String idCustomer, String typeCustomer, String address) {
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(String name, String date, String gender, String idCar, int numberPhone, String email, String idCustomer, String typeCustomer, String address) {
        super(name, date, gender, idCar, numberPhone, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                super.toString() +
                '}';
    }
}
