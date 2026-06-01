class Solution {
    static final  long mod=1000000007L;
    public int findMaxProduct(int[] arr) {
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        long maxproduct=1;
        int negativecount=0;
        int zerocount=0;
        int  MaxNegative=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zerocount++;
                continue;
            }
            if(arr[i]<0){
                negativecount++;
                if(arr[i]>MaxNegative){
                    MaxNegative=arr[i];
                }
            }
        }
        if(zerocount==n){
            return 0;
        }
        if(negativecount==1 && zerocount+negativecount==n){
            return 0;
        }
        boolean removed=false;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                continue;
            }
            if(negativecount%2==1 && !removed && arr[i]==MaxNegative){
                removed=true;
                continue;
            } 
            maxproduct=(maxproduct * arr[i])%mod;
        }       
        if(maxproduct<0){
            maxproduct=maxproduct+mod;
        }
        return (int)maxproduct;
    }
}
