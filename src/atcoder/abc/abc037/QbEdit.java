package atcoder.abc.abc037;

import java.util.Scanner;

public class QbEdit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            long t = sc.nextInt();
            for (int j = l; j < r + 1; j++) {
                a[j] = t;
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }
    }
}
