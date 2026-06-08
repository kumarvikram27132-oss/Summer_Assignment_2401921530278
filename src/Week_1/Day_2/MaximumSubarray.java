package Week_1.Day_2;

public class MaximumSubarray {
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        maximumSubarray(arr);
    }
     static int maximumSubarray(int[]arr){
         int maxsum=arr[0];
         int sum=arr[0];
         for(int i=1;i<arr.length;i++){
             sum=Math.max(sum+arr[i],arr[i]);
             maxsum=Math.max(sum,maxsum);
         }
         return maxsum;
     }
}
