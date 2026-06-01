class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
