package case_study_furama_resort.model;

public class Booking {
    private int idBooking;
    private int dayStart;
    private int dayEnd;
    private String idCustomer;
    private String nameService;
    private String typeService;

    public Booking() {
    }

    public Booking(int idBooking, int dayStart, int dayEnd, String idCustomer, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idBooking=" + idBooking +
                ", dayStart=" + dayStart +
                ", dayEnd=" + dayEnd +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
