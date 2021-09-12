import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String curr = "";
        int cnt = 0;

        while (!StdIn.isEmpty()) {
            String newStr = StdIn.readString();
            cnt += 1;
            if (StdRandom.bernoulli(1./cnt)) {
                curr = newStr;
            }
        }

        System.out.println(curr);
    }
}
