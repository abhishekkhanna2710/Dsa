package PractiseWithBuddies;

import java.util.Arrays;

class chocolate {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 4, 1, 9, 56, 7, 9, 12 };
        int n = arr.length;
        int m = 5;
        // int Min = arr[0];
        // int Max = Integer.MIN_VALUE;

        // for (int i = 1; i < m; i++) {
        // if (arr[i] > Max) {
        // Max = arr[i];
        // }
        // }
        Arrays.sort(arr);
        // 1 3 4 7 9 9 12 56
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - m; i++) { // 8 - 5 = 3
            int min = arr[i]; //  7
            int max = arr[i + m - 1]; // arr[0+5-1] = 56
            int gap = max - min; // 49
            int Min2 = Math.min(ans, gap);  // ans,8, 6, 8, 49
            ans = Min2;
        }

        System.out.println(ans);
    }
}