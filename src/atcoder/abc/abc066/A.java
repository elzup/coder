package atcoder.abc.abc066;

import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int res = Math.min(a + b, Math.min(b + c, c + a));
    System.out.println(res);
  }
}

