package _03_ArrayAndMethod.bai_tap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character= "ki tu xuat hien trong chuoi";
        char[] arr = character.toCharArray();
        System.out.println("Enter character ");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (array[0] == arr[i]) {
                count++;
            }
        }
        System.out.println("character " + character);
        System.out.println("character " + str + " appear " + count );
    }
}
