package introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConvertNuber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên cần đọc");
        int number = scanner.nextInt();
        if (number > 999 || number < 0) {
            System.out.println("Nhập lại số nguyên cần đọc");
        } else if (number < 10) {
            switch (number) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        } else {
            switch (number / 100) {
                case 1:
                    System.out.print("One Hundred"+" ");
                    break;
                case 2:
                    System.out.print("Two Hundred"+" ");
                    break;
                case 3:
                    System.out.print("Three Hundred"+" ");
                    break;
                case 4:
                    System.out.print("Four Hundred"+" ");
                    break;
                case 5:
                    System.out.print("Five Hundred"+" ");
                    break;
                case 6:
                    System.out.print("Six Hundred"+" ");
                    break;
                case 7:
                    System.out.print("Seven Hundred"+" ");
                    break;
                case 8:
                    System.out.print("Eight Hundred"+" ");
                    break;
                case 9:
                    System.out.print("Nine Hundred"+" ");
                    break;
            }

            switch (((number / 10) * 10) % 100) {
                case 10:
                    System.out.print("Ten");
                    break;
                case 20:
                    System.out.print(" Twenty ");
                    break;
                case 30:
                    System.out.print("Thirty");
                    break;
                case 40:
                    System.out.print(" Forty");
                    break;
                case 50:
                    System.out.print("Fifty");
                    break;
                case 60:
                    System.out.print(" Sixty");
                    break;
                case 70:
                    System.out.print("Seventy");
                    break;
                case 80:
                    System.out.print("Eighty");
                    break;
                case 90:
                    System.out.print(" Ninety");
                    break;
            }

            switch (number % 10) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        }
    }
}
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number: ");
//        String number = sc.nextLine();
//
//        int temp = Integer.parseInt(number);
//        number = temp + "";
//
//        String[] arrNumber = number.split("");
//
//        if (Integer.parseInt(number) < 10) {
//            if (number.equals("0")) {
//                System.out.println("Zero");
//            } else {
//                System.out.println(lessThanTen(number));
//            }
//        } else if (Integer.parseInt(number) < 100) {
//            System.out.println(greaterThanTen(arrNumber[0], lessThanTen(arrNumber[1])));
//        } else if (Integer.parseInt(number) < 1000){
//            System.out.println(greaterThanOneHundred(arrNumber[0], arrNumber[1], lessThanTen(arrNumber[2])));
//        }
//    }
//    public static String lessThanTen(String number) {
//        switch (number) {
//            case "0":
//                return "";
//            case "1":
//                return "One";
//            case "2":
//                return "Two";
//            case "3":
//                return "Three";
//            case "4":
//                return "Four";
//            case "5":
//                return "Five";
//            case "6":
//                return "Six";
//            case "7":
//                return "Seven";
//            case "8":
//                return "Eight";
//            case "9":
//                return "Nine";
//            default:
//                return "Out of ability";
//        }
//    }
//    public static String greaterThanTen(String number, String value) {
//        switch (number) {
//            case "1":
//                switch (value) {
//                    case "":
//                        return "Ten";
//                    case "One":
//                        return "Eleven";
//                    case "Two":
//                        return "Twelve";
//                    case "Three":
//                        return "Thirteen";
//                    case "Five":
//                        return "Fifteen";
//                    default:
//                        return value + "teen";
//                }
//            case "2":
//                switch (value) {
//                    case "":
//                        return "Twenty";
//                    default:
//                        return "Twenty-" + value.toLowerCase();
//                }
//            case "3":
//                switch (value) {
//                    case "":
//                        return "Thirty";
//                    default:
//                        return "Thirty-" + value.toLowerCase();
//                }
//            case "5":
//                switch (value) {
//                    case "":
//                        return "Fifty";
//                    default:
//                        return "Fifty-" + value.toLowerCase();
//                }
//            default:
//                switch (value) {
//                    case "":
//                        return lessThanTen(number) + "ty";
//                    default:
//                        return lessThanTen(number) + "ty-" + value.toLowerCase();
//                }
//        }
//    }
//    public static String greaterThanOneHundred(String number, String value1, String value2) {
//        switch (number) {
//            default:
//                switch (value1) {
//                    case "0":
//                        switch (value2) {
//                            case "":
//                                return lessThanTen(number) + " hundress";
//                        }
//                    default:
//                        switch (value1) {
//                            case "0":
//                                return lessThanTen(number) + " hundress and " + value2.toLowerCase();
//                            default:
//                                return lessThanTen(number) + " hundress and " + greaterThanTen(value1,value2).toLowerCase();
//                        }
//                }
//        }
//    }
//}
