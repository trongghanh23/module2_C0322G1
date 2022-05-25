package case_study_furama_resort.model;

public class Contract {
    private String idContract;
    private double deposit;
    private double totalMoney;
    private String idCustomer;

    public Contract() {
    }

    public Contract(String idContract, double deposit, double totalMoney, String idCustomer) {
        this.idContract = idContract;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
