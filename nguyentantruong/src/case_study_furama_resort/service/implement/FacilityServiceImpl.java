package case_study_furama_resort.service.implement;

import case_study_furama_resort.model.facility.Facility;
import case_study_furama_resort.model.facility.House;
import case_study_furama_resort.model.facility.Room;
import case_study_furama_resort.model.facility.Villa;
import case_study_furama_resort.service.iextend.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("dịch vụ "+element.getKey()+"số lần thuê: "+element.getValue());

        }


    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("nhập diện tích thuê: ");
        double acreage = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người: ");
        int numberPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu thuê: ");
        double rentalType = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập phòng tiêu chuẩn: ");
        String roomStandard = scanner.nextLine();
        System.out.println(" Nhập diện tích hồ bơi: ");
        double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        int numberFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(nameService, acreage, numberPerson, rentalType, roomStandard, swimmingPoolArea, numberFloors);
        facilityIntegerMap.put(villa, 0);
        System.out.println("đã thêm thành công:");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("nhập diện tích thuê: ");
        double acreage = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người: ");
        int numberPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu thuê: ");
        double rentalType = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập phòng tiêu chuẩn: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        int numberFloors = Integer.parseInt(scanner.nextLine());
        House house = new House(nameService, acreage, numberPerson, rentalType, roomStandard, numberFloors);
        facilityIntegerMap.put(house, 0);
        System.out.println("đã thêm thành công:");


    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("nhập diện tích thuê: ");
        double acreage = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số người: ");
        int numberPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu thuê: ");
        double rentalType = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập phòng tiêu chuẩn: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        int numberFloors = Integer.parseInt(scanner.nextLine());
        System.out.println("dịch vụ miễn phí đi kèm: ");
        String service=scanner.nextLine();
        Room room=new Room(nameService,acreage,numberPerson,rentalType,roomStandard,numberFloors,service);
        facilityIntegerMap.put(room,0);

        System.out.println("đã thêm thành công:");


    }
}
