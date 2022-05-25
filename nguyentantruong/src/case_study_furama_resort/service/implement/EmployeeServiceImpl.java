package case_study_furama_resort.service.implement;

import case_study_furama_resort.model.person.Employee;
import case_study_furama_resort.model.person.Person;
import case_study_furama_resort.service.iextend.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    public static Scanner scanner =new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);
    static List<Employee> personList=new ArrayList<>();
    static {
        personList.add(new Employee("nguyễn hữu an","6h00/13/2/2022","Nam","NV1",0154555124,"truogg@gmail.com","đại học","lễ tân",1000000));
        personList.add(new Employee("nguyễn an","8h00/14/2/2022","nữ","NV2",0154555124,"truogg@gmail.com","đại học","lễ tân",1000000));
        personList.add(new Employee("lê hữu an","11h00/13/2/2022","Nam","NV3",0154555124,"truogg@gmail.com","đại học","lễ tân",1000000));
        personList.add(new Employee("trần hữu an","13h00/15/2/2022","Nam","NV4",0154555124,"truogg@gmail.com","đại học","lễ tân",1000000));
        personList.add(new Employee("đỗ hữu an","19h00/13/2/2022","Nữ","NV5",0154555124,"truogg@gmail.com","đại học","lễ tân",1000000));
    }
    @Override
    public void displayEmployeeService() {
        for (Employee item:personList) {
            System.out.println(item);

        }

    }

    @Override
    public void addEmployeeService() {
        System.out.println("Nhập tên nhân viên: ");
        String name = input.nextLine();
        System.out.println("nhập ngày tháng năm sinh: ");
        String age =input.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender=input.nextLine();
        System.out.println("Mã nhân viên: ");
        String idCard =input.nextLine();
        System.out.println("Nhập số điện thoại: ");
        int numberPhone=Integer.parseInt(input.nextLine());
        System.out.println(" Nhập email: ");
        String email=input.nextLine();
        System.out.println("Nhập trình độ: ");
        String level =input.nextLine();
        System.out.println("Nhập vị trí làm việc: ");
        String location =input.nextLine();
        System.out.println("Nhập lương: ");
        double salary=Double.parseDouble(input.nextLine());
        Employee employee=new Employee(name,age,gender,idCard,numberPhone,email,level,location,salary);
        personList.add(employee);
        System.out.println("thêm thành công: ");
    }

    @Override
    public void editEmployeeService() {
        System.out.println("Nhập mã nhân viên cần sửa: ");
        String inputEditId=scanner.nextLine();
        int temp=0;
        for (int i = 0; i <personList.size() ; i++) {
            if (personList.get(i).getIdCar().equals(inputEditId)){
                System.out.println("Nhập tên nhân viên: ");
                String name=scanner.nextLine();
                System.out.println("nhập ngày tháng năm sinh: ");
                String age =input.nextLine();
                System.out.println("Nhập giới tính: ");
                String gender=input.nextLine();
                System.out.println("Mã nhân viên: ");
                String idCard =input.nextLine();
                System.out.println("Nhập số điện thoại: ");
                int numberPhone=Integer.parseInt(input.nextLine());
                System.out.println(" Nhập email: ");
                String email=input.nextLine();
                System.out.println("Nhập trình độ: ");
                String level =input.nextLine();
                System.out.println("Nhập vị trí làm việc: ");
                String location =input.nextLine();
                System.out.println("Nhập lương: ");
                double salary=Double.parseDouble(input.nextLine());

                personList.get(i).setName(name);
                personList.get(i).setDate(age);
                personList.get(i).setGender(gender);
                personList.get(i).setIdCar(idCard);
                personList.get(i).setNumberPhone(numberPhone);
                personList.get(i).setEmail(email);
                personList.get(i).setLevel(level);
                personList.get(i).setLocation(location);
                personList.get(i).setSalary(salary);
                temp++;
                System.out.println("Edit nhân viên thành công");
                break;
            }

        }
        if (temp==0){
            System.out.println("không tìm thấy nhân viên");
        }

    }
}
