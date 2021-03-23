package CodeGladiators;

import java.util.Scanner;

public class Round2 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            if (L == R) {
                System.out.println("0");
            } else {
                int nextL = nextPrimeL(L, R);
                int nextR = nextPrimeR(R, L);
                if (nextR == -1 & nextL == -1) {
                    System.out.println("-1");
                } else
                    System.out.println(nextR - nextL);
            }
        }
    }

    public static int nextPrimeL(int num, int R) {

        for (int i = 2; i < num; i++) {
            if (num > R) {
                return -1;
            } else {
                if (num % i == 0) {
                    num++;
                    i = 2;
                }
            }
        }
        return num;
    }


    public static int nextPrimeR(int num, int L) {

        for (int i = 2; i < num; i++) {
            if (num < L) {
                return -1;
            } else {
                if (num % i == 0) {
                    num--;
                    i = 2;
                }
            }
        }
        return num;
    }

}
