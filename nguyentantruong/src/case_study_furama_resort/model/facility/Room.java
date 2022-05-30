package case_study_furama_resort.model.facility;

public class
Room extends Facility {
    private String service;

    public Room() {
    }

    public Room(String service) {
        this.service = service;
    }

    public Room(String serviceName, double acreage, int numberPerson, double rentalType, String service) {
        super(serviceName, acreage, numberPerson, rentalType);
        this.service = service;
    }

    public Room(String nameService, double acreage, int numberPerson, double rentalType, String roomStandard, int numberFloors, String service) {
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Room{" +
                "service='" + service + '\'' +
                super.toString() +
                '}';
    }
}
