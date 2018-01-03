package dp;

import java.io.File;
import java.util.Scanner;

public class RodCutRec {
    private int price[];
    private int N;

    public RodCutRec(String filePath) {
        Scanner sc = readNumberFile(filePath);
        N = sc.nextInt();
        price = new int[N+1];
        for (int i = 1; i <= N && sc.hasNext(); i++) {
            price[i] = sc.nextInt();
        }
    }

    int rodCutRec() {
        return 0;
    }

    int min(int a, int b) {
        return a < b ? a : b;
    }

    int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("args = [" + 324975 + "]");
        String filePath = "/home/john/IdeaProjects/algo-programs/programs/classes/input.txt";
        RodCutRec rodCutRec = new RodCutRec(filePath);
    }

    private static Scanner readNumberFile(String filePath) {
        try {
            File file = new File(filePath);
            return new Scanner(file);
        } catch (Exception e) {
            System.out.println("Exception in reading file and exception is :: " + e);
            throw new RuntimeException("Exception is Here::"+e);
        }
    }
}
