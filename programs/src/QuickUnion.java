public class QuickUnion {
    private int n;
    private int idArr[];

    public QuickUnion(int n) {
        this.n = n;
        this.idArr = new int[n];
        for (int index = 0; index < n; index++) {
            this.idArr[index] = index;
        }
    }

    public boolean isConnected(int u, int v) {
        return root(u) == root(v);
    }

    public int root(int i) {
        while (i != idArr[i]) {
            i = idArr[i];
        }
        return i;
    }

    public void union(int u, int v) {
        int parentU = root(u);
        int parentV = root(v);
        idArr[parentU] = parentV;
    }
}
