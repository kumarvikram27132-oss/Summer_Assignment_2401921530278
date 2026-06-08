package Week_1.Day_1;

public class remove_Dublicate_fromSortedArray {
    public static void main(String[] args) {
        int []arr={1,1,2};
        System.out.println(  removedublicateElement(arr));
    }
    static int removedublicateElement(int[]nums){
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
