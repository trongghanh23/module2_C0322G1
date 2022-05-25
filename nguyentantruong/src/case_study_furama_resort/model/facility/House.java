package case_study_furama_resort.model.facility;

public class House extends Villa {
    public House() {
    }

    public House(String roomStandard, double swimmingPoolArea, int numberFloors) {
        super(roomStandard, swimmingPoolArea, numberFloors);
    }

    public House(String serviceName, double acreage, int numberPerson, double rentalType, String roomStandard, double swimmingPoolArea, int numberFloors) {
        super(serviceName, acreage, numberPerson, rentalType, roomStandard, swimmingPoolArea, numberFloors);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
