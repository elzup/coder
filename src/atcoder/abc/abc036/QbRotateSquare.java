package atcoder.abc.abc036;

import java.util.Scanner;

public class QbRotateSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] s = new char[n][n];
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = lines[n - j - 1].charAt(i);
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}
