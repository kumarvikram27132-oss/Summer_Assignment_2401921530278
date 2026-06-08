package Week_1.Day_3;

public class Move_Zeroes {
    public static void main(String[] args) {
   int []arr={1,8,9,0,5,0,0,4,0,0,0,0,8,6,3,7,1,2,0};
        moveZeroes(arr);
    }
    static void moveZeroes(int arr[]){
    int i=0;int j=1;
    int n=arr.length;
        while(j<n){
        if(arr[i]==0&&arr[j]!=0){
            swap(arr,i,j);
            j++;
            i++;
        }
        else if(arr[i]!=0&&arr[j]==0){
            i++;
            j++;
        }
        else if(arr[i]==0&&arr[j]==0){
            j++;
        }
        else{
            i++;
            j++;
        }
    }}
static void swap(int []arr,int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}}
