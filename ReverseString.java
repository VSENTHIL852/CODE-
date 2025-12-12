class ReverseString {
    public void reverseString(char[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            char tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }
        System.out.println(arr);
        
    }
}
