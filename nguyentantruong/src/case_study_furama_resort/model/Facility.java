package case_study_furama_resort.model;

public abstract class Facility {
    private int nameId;
    private String serviceName;
    private double acreage;
    private double rental;
    private int numberPerson;
    private double rentalType;


    public Facility() {
    }

    public Facility(int nameId, String serviceName, double acreage, double rental, int numberPerson, double rentalType) {
        this.nameId = nameId;
        this.serviceName = serviceName;
        this.acreage = acreage;
        this.rental = rental;
        this.numberPerson = numberPerson;
        this.rentalType = rentalType;
    }


    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public double getRental() {
        return rental;
    }

    public void setRental(double rental) {
        this.rental = rental;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public double getRentalType() {
        return rentalType;
    }

    public void setRentalType(double rentalType) {
        this.rentalType = rentalType;
    }

    public abstract String convert();

    @Override
    public String toString() {
        return "Facility{" +
                "nameId=" + nameId +
                ", serviceName='" + serviceName + '\'' +
                ", acreage=" + acreage +
                ", rental=" + rental +
                ", numberPerson=" + numberPerson +
                ", rentalType=" + rentalType +
                '}';
    }
}