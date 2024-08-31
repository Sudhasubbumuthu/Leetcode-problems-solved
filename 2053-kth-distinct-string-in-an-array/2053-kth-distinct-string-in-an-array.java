class Solution {
    public String kthDistinct(String[] arr, int k) {
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(firstIndexOf(arr, arr[i]) == lastIndexOf(arr, arr[i])){
                c++;
                System.out.println(arr[i]);
                if(c == k)
                    return arr[i];
            }
        }
        return "";
    }
    public int firstIndexOf(String[] arr, String s){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(s))
                return i;
        }
        return -1;
    }
    public int lastIndexOf(String[] arr, String s){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i].equals(s))
                return i;
        }
        return -1;
    }
}