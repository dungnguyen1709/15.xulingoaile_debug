package li_thuyet;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter.write("Hello.txt","Hello!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
