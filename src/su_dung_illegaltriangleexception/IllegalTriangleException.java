package su_dung_illegaltriangleexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        IllegalTriangleException ex = new IllegalTriangleException();
        try {
            ex.Triangle();
        } catch (InputMismatchException e) {
            System.out.println("Exception : Syntax error");

        }
    }

    private  void Triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the a :");
        int a = sc.nextInt();
        System.out.println(" Enter the b :");
        int b = sc.nextInt();
        System.out.println(" Enter the c :");
        int c = sc.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            throw  new InputMismatchException();
        }
        Tal(a,b,c);
    }

    private void Tal(int a, int b,int c) {
        try {
            if (a + b <= c || b + c <= a || a + c <= b) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Exception : Syntax error");
        }
    }

}
