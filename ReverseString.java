import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        String str="senthil";
        String n=rev(str);
        System.out.print(n);
        }
    static String rev(String str){
        char[] arr=str.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            char tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
