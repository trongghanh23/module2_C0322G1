package _12_java_collection_framework.exercise.utils;

import _12_java_collection_framework.exercise.model.Product;

import java.util.Comparator;

public class ProductAscendingPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }
}
