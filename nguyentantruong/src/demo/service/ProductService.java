package demo.service;

import demo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IPerson {
    Scanner scanner =new Scanner(System.in);
    static List<Person>personList=new ArrayList<>();
    static{
        personList.add(new Person());
    }

    @Override
    public void display() {

    }
}
