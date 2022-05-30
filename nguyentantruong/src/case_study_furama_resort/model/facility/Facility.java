package case_study_furama_resort.model.facility;

public abstract class Facility {
    private String serviceName;
    private double acreage;
    private int numberPerson;
    private double rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double acreage, int numberPerson, double rentalType) {
        this.serviceName = serviceName;
        this.acreage = acreage;
        this.numberPerson = numberPerson;
        this.rentalType = rentalType;
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

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", acreage=" + acreage +
                ", numberPerson=" + numberPerson +
                ", rentalType=" + rentalType +
                '}';
    }
}