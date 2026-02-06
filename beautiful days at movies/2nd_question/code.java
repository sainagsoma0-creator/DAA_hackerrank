import java.io.*;
import java.util.*;

public class Solution {

    // Function to perform circular array rotation
    static List<Integer> circularArrayRotation(
            List<Integer> a, int k, List<Integer> queries) {

        int n = a.size();
        k = k % n; // handle large rotations

        List<Integer> result = new ArrayList<>();

        for (int q : queries) {
            int originalIndex = (q - k + n) % n;
            result.add(a.get(originalIndex));
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        int q = Integer.parseInt(firstLine[2]);

        String[] arrInput = br.readLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(arrInput[i]));
        }

        List<Integer> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> result = circularArrayRotation(a, k, queries);

        for (int value : result) {
            System.out.println(value);
        }
    }
}
