class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        for(int i=start; i<=end; i++){
            boolean found=false;
         for(int j=0; j<arr.length;j++){
             if(arr[j]==i){
                 found=true;
                 break;
             }
             }
             if(found==false){
                 return false;
             }
        }
        return true;
    }
}
