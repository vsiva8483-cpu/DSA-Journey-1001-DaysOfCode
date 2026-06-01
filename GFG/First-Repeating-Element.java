class Solution {
    public static int firstRepeated(int[] arr) {
        // code her
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return i+1;
                }
            }
        }
        return -1;
    }
}
                
