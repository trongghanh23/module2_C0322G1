package _06_inheritance.bai_tap;

public class GiaiThuat {
    public static void main(String[] args) {
        int x=5;
        int a=4;
        int b=6;
        int e=1;
        for (int i = 1; i <=x; i++) {
            for (int j = 0; j <= x*2+1; j++) {
                if(j==a||j==b) {
                    System.out.print(e);
                }else {
                    System.out.print(" ");
                }
            }
            a--;
            b++;
            e++;
            System.out.println();
        }
        a=2;
        b=10;
        e=4;
        for (int i = 1; i < x; i++) {
            for (int j = 1; j <= x*2+1; j++) {
                if(j==a||j==b) {
                    System.out.print(e);
                }else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            e--;
            System.out.println();
        }

    }
}
