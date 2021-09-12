import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import jdk.nashorn.internal.runtime.regexp.joni.ast.QuantifierNode;

/**
 * Percolation class that represents a generic lattice structure as
 * a 2d array. If the lattice location has a 0 it is closed and if it
 * has a 1 it is open.
 */
public class Percolation {

    private int n;
    private int numOpen;
    private int[][] grid;
    private WeightedQuickUnionUF uf;

    public Percolation(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than or equal to 1.");
        }
        this.n = n;
        this.grid = new int[n][n];
        this.numOpen = 0;
        
        uf = new WeightedQuickUnionUF((int) Math.pow(n, 2) + 2);
        // Connect the dummy nodes
        for(int i = 1; i < n; i++) {
            uf.union(0, i);
            uf.union(n+1, n-i);
        }
        
    }

    private void boundsCheck(int row, int col) {
        if (row < 1 || col < 1 || row > n || col > n) {
            throw new IllegalArgumentException("row and col must be between [1, n].");
        }
    }

    public void open(int row, int col) {
        boundsCheck(row, col);
        if (grid[row][col] == 0) {
            grid[row][col] = 1;
            numOpen += 1;
        }
    }

    public boolean isOpen(int row, int col) {
        boundsCheck(row, col);
        return (grid[row][col] == 1);
    }

    public boolean isFull (int row, int col) {
        boundsCheck(row, col);
        return(grid[row][col] == 0);
    }

    public int numberOfOpenSites() {
        return numOpen;
    }

    public boolean percolates() {
        // todo
        return false;
    }

    public static void main(String[] args) {

    }
}
