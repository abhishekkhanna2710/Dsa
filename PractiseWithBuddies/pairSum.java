package PractiseWithBuddies;

public class pairSum {
   

    public static boolean check(int[] arr, int x, int n) {
        // ********Brute force approach******
        // int count =0;
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
   
        // if (arr[i] + arr[j] == x) {
        // count++;
        // System.out.println(arr[i] + " " + arr[j]);
        // }
        // }
        // }

        // if(count==0){

        // System.out.println("false");
        // }

        // time complexity = 0(n2)

        // now let us dicuss more optimize approach

        // find the pivot index
        int i;
        for ( i = 0; i < n; i++)
            if (arr[i] > arr[i + 1])
                break;

        int l = (i + 1) % n; // index of lower element
        int r = i; // index of higher element

        while (l != r) {
            if (arr[l] + arr[r] == x)
                return true;

            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

            else
                r = (n + r - 1) % n;

        }
        return false;
        // time complexity = 0(n)
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 11, 15, 26, 38, 9, 10 };
        int n = arr.length;
        int x = 19;

        boolean res = check(arr, x, n);

        if (res) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
