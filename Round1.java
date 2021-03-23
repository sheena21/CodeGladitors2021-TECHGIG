package CodeGladiators;

import java.util.Scanner;

public class Round1 {
    public static void main(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String virus = sc.next();
        int N = sc.nextInt();
        String[] blood = new String[N];
        for (int i = 0; i < N; i++) {
            blood[i] = sc.next();
        }
        for (int i = 0; i < N; i++) {
            String bloodComp = blood[i];
            System.out.println(helper(bloodComp, virus));
        }
    }

    public static String helper(String bloodComp, String virus) throws Exception {
        System.out.println(bloodComp + " & " + virus);
        if (bloodComp.length() == 0) {
            return "Positive";

        }
        char ch = bloodComp.charAt(0);
        int indexBlood = bloodComp.indexOf(ch);
        int n = virus.indexOf(ch);
        System.out.println("Value of index" + n);
        if (n < 0) {
            return "Negative";
        }
        if (virus.substring(n, virus.length()).length() < bloodComp.length())
            return "Negative";
        else
            return helper(bloodComp.substring(indexBlood + 1, bloodComp.length()), virus.substring(n + 1, virus.length()));


    }
}
