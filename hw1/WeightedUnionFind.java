public class WeightedUnionFind {
    private int[] forest;
    private int[] size;
    private int ccount;

    public WeightedUnionFind(int n) {
        this.forest = new int[n];
        for(int i = 0; i < n; i++) {
            forest[i] = i;
            size[i] = 1;
        }
        this.ccount = n;
    }

    public void Union(int u, int v) {
        // todo
    }

    public Boolean Find(int u, int v) {
        //todo
        return false;
    }

    public int count() {
        return ccount;
    }
}
