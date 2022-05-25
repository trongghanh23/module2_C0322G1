package case_study_furama_resort.model.facility;

import case_study_furama_resort.model.facility.Facility;

public class
Room extends Facility {
    private boolean service;

    public Room() {
    }

    public Room(boolean service) {
        this.service = service;
    }

    public Room(String serviceName, double acreage, int numberPerson, double rentalType, boolean service) {
        super(serviceName, acreage, numberPerson, rentalType);
        this.service = service;
    }

    @Override
    public String toString() {
        return "Room{" +
                "service=" + service +
                super.toString()+
                '}';
    }
}
