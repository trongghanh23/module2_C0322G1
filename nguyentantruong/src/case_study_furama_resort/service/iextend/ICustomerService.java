package case_study_furama_resort.service.iextend;

import case_study_furama_resort.service.IService;

public interface ICustomerService extends IService {
    void displayCustomer();

    void editCustomer();

    void addCustomer();
}
