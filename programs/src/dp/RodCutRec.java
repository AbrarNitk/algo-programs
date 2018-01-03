package dp;

import java.io.File;
import java.util.Scanner;

public class RodCutRec {
    int price[];
    int n;
    public RodCutRec(){

    }

    public static void main(String[] args) {
        System.out.println("args = [" +324975+ "]");
        Scanner sc = readNumberFile("/home/john/IdeaProjects/algo-programs/programs/classes/input.txt");
        int n = sc.nextInt();
        while (sc.hasNext()){
            System.out.println(sc.nextInt());
        }
    }

    public static Scanner readNumberFile(String filePath) {
        try {
            File file = new File(filePath);
            return new Scanner(file);
        } catch (Exception e) {
            System.out.println("Exception in reading file and exception is :: " + e);
        }
        return null;
    }
}
