package ConceptPractice;

import java.io.*;
import java.math.*;
import java.util.Arrays;

class GFG{

    // Function to find the maximum length
// of a subsequence of same characters
// after at most K increment operations
    static void maxSubsequenceLen(String s, int K)
    {

        // Store the size of s
        int N = s.length();

        int start = 0, end = 0;

        // Sort the given string
        //sort(S.begin(), S.end());
        // convert input string to char array
        char S[] = s.toCharArray();

        // sort tempArray
        Arrays.sort(S);

        // Stores the maximum length and the
        // sum of the sliding window
        int ans = Integer.MIN_VALUE, sum = 0;

        // Traverse the string S
        for(end = 0; end < N; end++)
        {

            // Add the current character
            // to the window
            sum = sum + (S[end] - 'a');
            System.out.println("sum :" +sum + " end :"+end);
            // Decrease the window size
            while (sum + K < (S[end] - 'a') *
                    (end - start + 1))
            {

                // Update the value of sum
                sum = sum - (S[start] - 'a');

                // Increment the value
                // of start
                start++;
            }

            // Update the maximum window size
            ans = Math.max(ans, end - start + 1);
        }

        // Print the resulant maximum
        // length of the subsequence
        System.out.println(ans);
    }

    // Driver code
    public static void main(String args[])
    {
        String S = "acscbcca";
        int K = 1;

        maxSubsequenceLen(S, K);
    }
}

// This code is contributed by jana_sayantan
