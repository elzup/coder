package atcoder.atc.atc001;

import java.util.Scanner;

public class QbUnionFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int qn = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < qn; i++) {
            int p = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (p == 0) {
                uf.merge(a, b);
            } else {
                System.out.println(uf.equals(a, b) ? "Yes" : "No");
            }
        }
    }

    static class UnionFind {
        int[] gid, rank;

        UnionFind(int n) {
            gid = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                gid[i] = i;
                rank[i] = 0;
            }
        }

        int find(int a) {
            if (gid[a] == a) {
                return a;
            }
            return gid[a] = find(gid[a]);
        }

        boolean equals(int a, int b) {
            return find(a) == find(b);
        }

        void merge(int a, int b) {
            int ra = find(a);
            int rb = find(b);
            if (ra == rb) { return; }
            if (rank[ra] < rank[rb]) {
                gid[ra] = rb;
            } else {
                gid[rb] = ra;
                if (rank[ra] == rank[rb]) {
                    rank[ra] ++;
                }
            }
        }
    }
}
