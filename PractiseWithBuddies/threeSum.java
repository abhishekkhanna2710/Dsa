package PractiseWithBuddies;

import java.util.Arrays;

public class threeSum {
    public static void solve(int n, int[] nums) {
        // brute force approach
        // for (int i = 0; i < n - 2; i++) {
        // for (int j = i + 1; j < n - 1; j++) {
        // for (int k = j + 1; k < n; k++) {
        // if (nums[i] + nums[j] + nums[k] == 0) {
        // System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
        // }
        // }
        // }
        // }

        // ******Using two pointers approach******
        
        // -4   -1   -1   0   1   2 
        //                i     
        //                    j                            
        //                         k
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {//-1 + 0 +1 = 0
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    break;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
             System.out.println("dont know");
             // dont know
             //-1 - 2 2 
             //-1 0 1
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        int n = nums.length;

        solve(n, nums);
    }
}
