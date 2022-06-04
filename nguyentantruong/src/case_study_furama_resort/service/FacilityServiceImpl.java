package case_study_furama_resort.service;

import case_study_furama_resort.model.House;
import case_study_furama_resort.model.Room;
import case_study_furama_resort.model.Villa;
import case_study_furama_resort.service.iextend.IFacilityService;
import case_study_furama_resort.utils.read_and_write_file.ReadAndWriteCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Scanner sc = new Scanner(System.in);

    private static Map<Villa, Integer> villas = new LinkedHashMap<>();
    private static Map<House, Integer> houses = new LinkedHashMap<>();
    private static Map<Room, Integer> rooms = new LinkedHashMap<>();

    private static final String PATH_VILLA = "src/case_study_furama_resort/data/villa.csv";
    private static final String PATH_HOUSE = "src/case_study_furama_resort/data/house.csv";
    private static final String PATH_ROOM = "src/case_study_furama_resort/data/room.csv";


    @Override
    public void display() {

        villas = ReadAndWriteCharacter.readVilla(PATH_VILLA);
        System.out.println("*---List Facility---*");
        for (Map.Entry<Villa, Integer> item : villas.entrySet()) {
            System.out.println(item.getKey() + " Number of Used: " + item.getValue());
        }

    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        villas = ReadAndWriteCharacter.readVilla(PATH_VILLA);
        System.out.println("*---Enter the Villa---*");

        System.out.println("nhập id");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("nhập tên:");
        String name = sc.nextLine();

        System.out.println("nhập diện tích:");
        Double area = Double.parseDouble(sc.nextLine());

        System.out.println("nhập số người:");
        double person = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập loại thuê: ");
        int type = Integer.parseInt(sc.nextLine());
        System.out.println("nhập kiểu phòng");
        String room= sc.nextLine();

        System.out.println("nhập diện tích hồ bơi");
        Double pool = Double.parseDouble(sc.nextLine());

        System.out.println("nhập số tầng");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("nhập giá thue");
        Double acrea = Double.parseDouble(sc.nextLine());

        Villa villa = new Villa(id, name, area, acrea, type, person, room, pool, num);
        villas.put(villa, 0);
        ReadAndWriteCharacter.writeVilla(PATH_VILLA, villas);
        System.out.println("Success added!");

    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }


}
