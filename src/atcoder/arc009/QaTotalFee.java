package atcoder.arc009;

import java.util.Scanner;

public class QaTotalFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        int p = (int)((float) sum * 1.05);
        System.out.println(p);
    }
}
