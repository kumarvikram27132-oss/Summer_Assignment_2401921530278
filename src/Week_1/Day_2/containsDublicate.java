package Week_1.Day_2;
import java.util.*;
public class containsDublicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        containDublicate(arr);
    }
    static boolean containDublicate(int[]arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){

            if(arr[i]==arr[i-1]){
                return  true;}

        }
        return false;
    }
}
