package Week_2.Day_5;

public class String_Compression {
    public static void main(String[] args) {
        char[]c={'a','a','b','b','c','c','c'};
        compress(c);
    }
    public  static int compress(char[] c) {
        int idx=0;
        int i=0;
        while(i<c.length){
            int j=i;
            while(j<c.length&&c[i]==c[j]){
                j++;
            }
            c[idx++]=c[i];
            int len=j-i;
            if(len>1){
                String s=String.valueOf(len);
                for(char ch:s.toCharArray()){
                    c[idx++]=ch;
                }
            }
            i=j;
        }
        return idx;
}}
