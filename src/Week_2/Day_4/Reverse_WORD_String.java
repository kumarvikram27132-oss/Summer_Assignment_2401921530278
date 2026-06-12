package Week_2.Day_4;

public class Reverse_WORD_String {
    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        System.out.println(revsereWordString(str));;
    }
    static String revsereWordString(String s){
        char[] arr = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
