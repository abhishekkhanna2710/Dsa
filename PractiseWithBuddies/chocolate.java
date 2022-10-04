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
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - m; i++) {
            int min = arr[i];
            int max = arr[i + m - 1];
            int gap = max - min;
            int Min2 = Math.min(ans, gap);
            ans = Min2;
        }

        System.out.println(ans);
    }
}