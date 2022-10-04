import java.util.ArrayList;

public class firstNegative {
    public static void main(String[] args) {
        int[] arr = new int[] { -4, -1, 3, 12, -3, 6, -7 };
        int n = arr.length;
        int k = 3;
        // *****Brute Force Method*******/
        // Boolean flag = true;
        // for (int i = 0; i <= n - k; i++) {// 2 <= 2
        // flag = false;
        // for (int j = i; j < i + k; j++) { // 2 <5
        // if (arr[j] < 0) {// -3
        // System.out.print(arr[j] + " "); //-3, -3, -3
        // flag = true;
        // break;
        // }
        // }
        // if (flag == false) {
        // System.out.print(0 + " ");
        // }
        // }

        // Using sliding window method

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < n) {
            if (arr[j] < 0) {
                list.add(arr[j]);
            }

            if ((j - i + 1) < k) {
                j++;
            }
            if ((j - i + 1) == k) {
                if (list.size() == 0) {     
                    System.out.print(0 + "");
                } else {
                    System.out.print(list.get(0) + " ");
                    if (arr[i] == list.get(0)) {
                        list.remove(list.get(0));
                    }
                }
                i++;
                j++;
            }
        }

    }
}

// Time complexity = O(n*k) for brute force