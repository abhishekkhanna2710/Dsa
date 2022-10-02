class Main {

    public static int solve(int[] arr, int n, int k) {
        int i = 0;// starting point
        int j = 0; // ending point
        int sum = 0;
        int Max = Integer.MIN_VALUE;
        while (j < n) {
            sum += arr[j];
            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                Max = Math.max(Max, sum);
                sum -= arr[i];// because we need to remove the i index element and add j elememt
                i++;
                j++;
            }
        }
        return Max;

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, -1, -3, 5, 3, 6, 7 };
        int n = arr.length;
        int k = 2;
        int ans = solve(arr, n, k);
        System.out.println(ans);
    }
}