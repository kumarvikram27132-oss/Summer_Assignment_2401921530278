package Week_1.Day_1;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int []arr={2,5,11,7};
       int ans[]= twosum(arr,9);

    }
    static int[]twosum(int []arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need =target-arr[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
