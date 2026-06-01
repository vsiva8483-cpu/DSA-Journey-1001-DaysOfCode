class Solution {
    public boolean wifiRange(String s, int x) {
        // code here
       int n=s.length();
       for(int i=0; i<n;i++){
           boolean cover =false;
           int start=i-x;
           int end=i+x;
           if(start<0){
               start=0;
           }
           if(end>=n){
               end=n-1;
           }
           for(int j=start; j<=end; j++){
                if(s.charAt(j)=='1'){
                    cover=true;
                    break;
                }
           }
           if(!cover){
               return false;
           }
       }
       return true;
    }
}
