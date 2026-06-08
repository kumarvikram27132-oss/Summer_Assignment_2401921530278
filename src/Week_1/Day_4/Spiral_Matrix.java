package Week_1.Day_4;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
   int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
    }
    public List<Integer> spiralOrder(int[][] arr) {
    ArrayList<Integer> ans= new ArrayList<>();

    int frow=0;
    int lrow=arr.length-1;
    int fcol=0;
    int lcol=arr[0].length-1;
        while(frow<=lrow&&fcol<=lcol){
        for(int j=fcol;j<=lcol;j++){
            ans.add(arr[frow][j]);

        }
        frow++;
        if(frow>lrow||fcol>lcol)break;
        for(int i=frow;i<=lrow;i++){
            ans.add(arr[i][lcol]);

        }
        lcol--;
        if(frow>lrow||fcol>lcol)break;
        for(int j=lcol;j>=fcol;j--){
            ans.add(arr[lrow][j]);

        }
        lrow--;
        if(frow>lrow||fcol>lcol)break;
        for(int i=lrow;i>=frow;i--){
            ans.add(arr[i][fcol]);

        }
        fcol++;
        if(frow>lrow||fcol>lcol)break;
    }
        return ans;

}}
