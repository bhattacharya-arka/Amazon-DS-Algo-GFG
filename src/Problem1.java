/*
You are given an integer N. You need to convert all zeroes of N to 5.

Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".

Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".

Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10000
*/

//{ Driver Code Starts

import java.util.Scanner;
import java.lang.Math;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG1().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG1 {
    int convertfive(int num) {
        // Your code here
        int new_num = 0;
        int d = 0;
        boolean hasZero = false;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            new_num += (digit * (int) Math.pow(10, d));
            d++;
            num /= 10;
        }
        return new_num;
    }
}