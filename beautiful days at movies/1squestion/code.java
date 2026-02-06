import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for (int day = i; day <= j; day++) {
            int rev = 0;
            int temp = day;

            // Reverse the number
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            // Check if beautiful
            if (Math.abs(day - rev) % k == 0) {
                count++;
            }
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);
        int j = Integer.parseInt(firstMultipleInput[1]);
        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
