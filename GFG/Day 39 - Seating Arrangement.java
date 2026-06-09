class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        if(k==0){
            return true;
        }
        int n =seats.length;
        // code here
        int count=0;
        for(int i=0; i<n;i++){
            if(seats[i]==0 && (i==0 || seats[i-1] == 0)&&(i==n-1  || seats[i+1]==0)){
                seats[i]=1;
                count++;
            if(count==k){
                return true;
            }
        }
    }
        return false;
    }
}
