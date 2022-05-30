package case_study_furama_resort.model.facility;

import case_study_furama_resort.model.facility.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double swimmingPoolArea, int numberFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceName, double acreage, int numberPerson, double rentalType, String roomStandard, double swimmingPoolArea, int numberFloors) {
        super(serviceName, acreage, numberPerson, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberFloors=" + numberFloors +
                super.toString() +
                '}';
    }
}
