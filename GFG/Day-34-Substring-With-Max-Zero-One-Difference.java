class Solution {
    int maxSubstring(String s) {
        // code here
        int current=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='0'){
                current=current+1;
            }
            else{
                current=current-1;
            }
            if(current>max)
            max=current;
        if(current<0){
            current=0;
        }
    }
        if(max<=0){
            return -1;
        }
        return max;
    }
}
