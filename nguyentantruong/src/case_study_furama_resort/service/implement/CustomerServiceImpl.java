package case_study_furama_resort.service.implement;

import case_study_furama_resort.model.person.Customer;
import case_study_furama_resort.service.iextend.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    public static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("nguyễn văn hậu", "12/2/1997", "nam", "543465656", 45657, "hậu@123gmail.com", "KH1", "Gold", "Đà nẵng"));
        customerList.add(new Customer("nguyễn văn tuấn", "10/2/1987", "nam", "543465656", 45657, "tuan@123gmail.com", "KH2", "member", "Quảng nam"));
        customerList.add(new Customer("nguyễn thi hoà", "12/2/1999", "nữ", "543465656", 45657, "hoa@123gmail.com", "KH3", "member", "Đà nẵng"));
    }

    @Override
    public void displayCustomer() {
        for (Customer item : customerList) {
            System.out.println(item);

        }

    }

    @Override
    public void addCustomer() {
        System.out.println("Nhập tên khách hàng cần thêm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String date = scanner.nextLine();
        System.out.println("nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("nhập cmnd: ");
        String idCar = scanner.nextLine();
        System.out.println("nhập số điện thoại: ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("nhập mã khách hàng: ");
        String idCustomer = scanner.nextLine();
        System.out.println("nhập loại khách hàng: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("nhập địa chỉ khách hàng: ");
        String addressCustomer = scanner.nextLine();
        Customer customer = new Customer(name, date, gender, idCar, numberPhone, email, idCustomer, typeCustomer, addressCustomer);
        customerList.add(customer);
        System.out.println("Đã thêm khách hàng thành công: ");

    }

    @Override
    public void editCustomer() {
        System.out.println("nhập id khách hàng cần sửa: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean check=true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId().equals(input)) {
                System.out.println("Nhập tên khách hàng: ");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh: ");
                String date = scanner.nextLine();
                System.out.println("nhập giới tính: ");
                String gender = scanner.nextLine();
                System.out.println("nhập cmd");
                String idCard = scanner.nextLine();
                System.out.println("nhập số điện thoại: ");
                int numberPhone = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập email: ");
                String email = scanner.nextLine();
                System.out.println("nhập mã khách hàng: ");
                String idCustomer = scanner.nextLine();
                System.out.println("nhập loại khách hàng: ");
                String typeCustomer = scanner.nextLine();
                System.out.println("nhập địa chỉ khách hàng: ");
                String address = scanner.nextLine();
                Customer customer = new Customer(name, date, gender, idCard, numberPhone, email, idCustomer, typeCustomer, address);
                customerList.set(i,customer);

                System.out.println("Sửa khách hàng thành công: ");
                check=false;
                break;
            }
        }
        if (check){
            System.out.println("nhập mã khách hàng sai vui lòng nhập lại");
            editCustomer();
        }

    }


}
