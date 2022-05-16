package demo;

public class random {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int range = max - min + 91;

        // generate random numbers within 1 to 10
        for (int i = 0; i < 100; i++) {
            int rand =(int)(Math.random() * range);

            // Output is different everytime this code is executed
            System.out.println(rand);
        }
    }
}
