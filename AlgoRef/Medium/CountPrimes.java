/**
 * Created by ggaddam on 8/21/2016.
 */
public class CountPrimes {
    private static int count(int n) {
        if (n <= 1) return 0;

        boolean[] nonPrimes = new boolean[n];

        for (int i = 2; i < n; i++) {
            if (nonPrimes[i] == false) {
                for (int j = 2; i * j < n; j++) nonPrimes[i * j] = true;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (nonPrimes[i] == false) count++;
        }

        return count;
    }

    public static void main(String args[]){
        count(5);
    }
}
