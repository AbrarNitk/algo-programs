import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class QuickFind {
    int id[];
    int size;

    public QuickFind(int n) {
        this.id = new int[n];
        this.size = n;
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    public void union(int u, int v) {
        int uid = id[u];
        int vid = id[v];
        for (int i = 0; i < size; i++) {
            if (id[i] == vid)
                id[i] = uid;
        }
    }


    public boolean isConnected(int u, int v) {
        return (id[u] == id[v]);
    }

    public static void main(String[] args) throws Exception {
        File file = new File("unionFindInput");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        int t = sc.nextInt();
        QuickFind qf = new QuickFind(n);
        while (n-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            System.out.println(u + " :: " + v);
            qf.union(u, v);
        }

        PrintStream pr = new PrintStream("unionFindOutput.txt");
        while(t-- > 0){
            int u = sc.nextInt();
            int v = sc.nextInt();

            pr.println("u : "+ u + ", v: " + v + " isConnected Status :  "+qf.isConnected(u,v));
            System.out.println("u : "+ u + ", v: " + v + " isConnected Status :  "+qf.isConnected(u,v));
        }
        pr.close();
    }
}
