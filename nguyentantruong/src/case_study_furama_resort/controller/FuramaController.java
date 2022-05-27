
package case_study_furama_resort.controller;

import case_study_furama_resort.service.IService;
import case_study_furama_resort.service.iextend.ICustomerService;
import case_study_furama_resort.service.iextend.IEmployeeService;
import case_study_furama_resort.service.implement.CustomerServiceImpl;
import case_study_furama_resort.service.implement.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class FuramaController {
    static IEmployeeService iEmployeeService=new EmployeeServiceImpl();
    static ICustomerService iCustomerService=new CustomerServiceImpl();

    public static Scanner scanner = new Scanner(System.in);

    public static void display() {
        do {
            System.out.println("" +
                    "1. Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            System.out.println("Choose options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayEmployee();
                    break;
                case 2:
                   displayCustomer();

                    break;
                case 3:
                    displayFacility();

                    break;
                case 4:
                    displayBooking();
                    break;

                case 5:
                    displayPromotion();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Mời chọn lại chức năng: ");
            }

        }
        while (true);

    }

    public static void displayEmployee() {
        System.out.println("" +
                "1. Display list employees\n" +
                "2. Add new employee\n" +
                "3. Edit employee\n" +
                "4. Return main menu\n");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                iEmployeeService.displayEmployeeService();
                break;
            case 2:
                iEmployeeService.addEmployeeService();
                break;
            case 3:
                iEmployeeService.editEmployeeService();
                break;
            case 4:
                display();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Mời nhập lại chức năng");
        }
    }

    public static void displayCustomer() {
        System.out.println("" +
                "1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu\n");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                iCustomerService.displayCustomer();
                break;
            case 2:
                iCustomerService.addCustomer();
                break;
            case 3:
                iCustomerService.editCustomer();
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Mời nhập lại chức năng");
        }
    }

    public static void displayFacility() {
        System.out.println("" +
                "1. Display list facility\n" +
                "2. Add new facility\n" +
                "3. tDisplay list facility maintenance\n" +
                "4. Return main menu\n");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Mời nhập lại chức năng");
        }
    }

    public static void displayBooking() {
        System.out.println("" +
                "1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new constracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu\n");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("Mời nhập lại chức năng");
        }
    }
    public static void displayPromotion(){
        System.out.println("" +
                "1.Display list customers use service\n" +
                "2.Display list customers get voucher\n" +
                "3.Return main menu\n");
        int input =Integer.parseInt(scanner.nextLine());
        switch (input){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Mời chọn lại chức năng: ");
        }
    }
}
