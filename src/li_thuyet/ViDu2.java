package li_thuyet;

import java.io.IOException;

public class ViDu2 {
    static void validate(int age) throws IOException {
        if (age < 18)
           // throw  new ArithmeticException("not vaild");
        throw  new IOException("not vaild");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        try {
            validate(13);
        }catch (IOException ex) {
            System.out.println("loi");
        }
        System.out.println("rest of the code");
    }
}
