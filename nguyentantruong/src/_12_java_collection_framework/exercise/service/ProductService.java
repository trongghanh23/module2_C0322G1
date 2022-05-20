package _12_java_collection_framework.exercise.service;

import _12_java_collection_framework.exercise.model.Product;
import _12_java_collection_framework.exercise.utils.ProductAscendingPriceComparator;
import _12_java_collection_framework.exercise.utils.ProductDescendingPriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "dell", 6000000, 2, "dell"));
        productList.add(new Product(2, "macbook", 12000000, 3, "Apple"));
        productList.add(new Product(3, "asus", 8000000, 4, "Asus"));
        productList.add(new Product(4, "lenovo", 1000000, 5, "Lenovo"));
        productList.add(new Product(5, "acer", 10000000, 6, "Acer"));
        productList.add(new Product(6, "hp", 11000000, 7, "HP"));

    }

    @Override
    public void addNewProduct() {
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng sản phẩm: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sãn xuất: ");
        String production = scanner.nextLine();
        int id = productList.get(productList.size() - 1).getId() + 1;
        Product product = new Product(id, name, price, amount, production);
        productList.add(product);
        System.out.println("Đã thêm sản phẩm thành công");
    }

    @Override
    public void displayListProduct() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product item : productList) {
            System.out.println(item);

        }
    }

    @Override
    public void removeProductById() {
        System.out.println("Nhập vào id cần xoá sản phẩm: ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        if (idProduct - 1 >= productList.size()) {
            System.out.println("id sản phẩm cần xoá không có");
        } else {

            productList.remove(idProduct - 1);

        }
        System.out.println("xoá sản phẩm thành công: ");
    }

    @Override
    public void updateProduct() {
        System.out.println("Nhập id sản phẩm cần sữa: ");
        int inputUpdateId = Integer.parseInt(scanner.nextLine());
        int temp = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == inputUpdateId) {
                System.out.println("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.println("Nhập Giá sản phẩm: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập Số lượng sản phẩm: ");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập nhà sản xuất sản phẩm: ");
                String production = scanner.nextLine();

                productList.get(i).setNameProduct(name);
                productList.get(i).setPrice(price);
                productList.get(i).setAmount(amount);
                productList.get(i).setProduction(production);
                temp++;
                System.out.println("Sửa sản phẩm thành công :");
                break;
            }
        }

        if (temp == 0) {
            System.out.println("không tìm thấy id sản phẩm cần sửa :");
        }
    }

    @Override
    public void findProductByName() {
        System.out.println("Nhập tên sản phẩm  muốn tìm: ");
        String inputName = scanner.nextLine();
        int temp = 0;
        for (int i = 0; i < productList.size(); i++) {
            if ((productList.get(i)).getNameProduct().contains(inputName)) {
                System.out.println(productList.get(i));
                temp++;
            }
        }

        if (temp == 0) {
            System.out.println("không tìm thấy tên sản phẩm");
        }
    }

    @Override
    public void sortAscendingPrice() {
        System.out.println("Danh sách sắp xếp tăng theo giá sản phẩm: ");
        Collections.sort(productList, new ProductAscendingPriceComparator());
        for (Product item : productList) {
            System.out.println(item);

        }
    }

    @Override
    public void sortDescendingPrice() {
        System.out.println("Danh sách sắp xếp giảm theo giá sản phẩm: ");
        Collections.sort(productList, new ProductDescendingPriceComparator());
        for (Product item : productList) {
            System.out.println(item);

        }

    }
}


