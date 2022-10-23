package Strings;

public class mobileKeypad {
    public static String printSequence(String arr[], String input) {
        // ABHISHEK
        //   i
        String output = "";
        int n = input.length();
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == ' ') {
                output = output + "0";
            } else {
                int pos = input.charAt(i) - 'A';//75 - 65 =10
                output = output + arr[pos]; //2
            }
        }

        return output;//2 22 44 444 7777 44 33 55

    }

    public static void main(String[] args) {
        String str[] = { "2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999" };

        String input = "ABHISHEK";
        System.out.println(printSequence(str, input));
    }
}
