package Week_1.Day_3;

public class Container_with_mostWater {
    public static void main(String[] args) {
    int[]arr={1,8,6,2,5,4,8,3,7};
        System.out.println(  containsmaximumwater(arr));;
    }
    static int containsmaximumwater(int []arr){

    int i = 0, j = arr.length - 1;
    int maxarea = 0;

        while (i < j) {
        int widht=(j-i);
        int height=Math.min(arr[i],arr[j]);
        int area = widht*height;
        maxarea = Math.max(maxarea, area);

        if (arr[i] < arr[j]) {
            i++;
        } else {
            j--;
        }
    }
        return maxarea;
}}
