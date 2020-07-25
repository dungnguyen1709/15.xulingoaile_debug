package li_thuyet;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViDu {
    public static int input() throws InputMismatchException, IOException {
        System.out.println(" Nhap so :");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        return b;

    }
    public static void main(String[] args) {
//        int[] array = new int[5];
//        System.out.println(array[5]);

 //       try {
//            System.out.println(" Nhap so :");
//            Scanner sc = new Scanner(System.in);
//            int b = sc.nextInt();
//            int result = 10/b;
        try {
            int b =input();
            int result = 10/b;
            System.out.println(result);
        } catch (InputMismatchException ex) {
            System.out.println("InputMismatchException");
        } catch (IOException ex) {
            System.out.println("IOEx");
        }
        System.out.println("@@");
//        } catch (InputMismatchException ex) {
//            System.out.println( " loi nhap kieu du lieu " + ex.getMessage());
//        } catch (ArithmeticException ex) {
//            System.out.println(" loi chia cho 0 " + ex.getMessage());
//        } catch (RuntimeException ex) {
//            System.out.println("loi" + ex.getMessage());
//        } finally {
//            System.out.println("Finally");
//        }
    }
}
