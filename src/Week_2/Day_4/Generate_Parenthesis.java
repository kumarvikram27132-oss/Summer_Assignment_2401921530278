package Week_2.Day_4;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
    public static void main(String[] args) {
 int n=3;
 generateParenthesis(n);
    }
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();
        print(n,0,0,"",list);
        return list;

    }
    public static void print(int n,int l,int r,String s,ArrayList<String> list){
        if(r==n){
            list.add(s);
            return;
        }
        if(l<n) print(n,l+1,r,s+"(",list);
        if(r<l) print(n,l,r+1,s+")",list);
    }
}
