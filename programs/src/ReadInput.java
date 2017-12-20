import java.io.File;
import java.util.Scanner;


public class ReadInput {
    public static Scanner readNumberFile(String filePath) {
        try {
            File file = new File(filePath);
            return new Scanner(file);
        } catch (Exception e) {
            System.out.println("Exception in reading file and exception is :: " + e);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = readNumberFile(args[0]);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println("n = " + n);
        }
    }
}
