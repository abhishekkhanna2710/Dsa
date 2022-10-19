package PractiseWithBuddies;

public class pairSum {
    public static void check(int[] arr, int x, int n) {

        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // sum+=;
                if (arr[i] + arr[j] == x) {
                    count++;
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

        if(count==0){

            System.out.println("false");
        }
        
       
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 11, 15, 26, 38, 9, 10 };
        int n = arr.length;
        int x = 193;

        check(arr, x, n);

    }
}
