public class mergePalindrome {

    public static void main(String[] args) {
        int arr[] = new int[] { 15, 4, 15 };
        int n = arr.length;
        // 1 4 5 9 1
        // i
        // j
        int i = 0;
        int j = n - 1;
        int ans = 0;
        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] < arr[j]) {
                i++;
                arr[i] += arr[i + 1];
                ans++;
            } else {
                j--;
                arr[j] += arr[j - 1];
                ans++;
            }
        }
        System.out.println(ans);
    }
}
