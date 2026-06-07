lass Solution {
    public int[] leftRightDifference(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       int totalsum=0;
       for(int num:nums){
        totalsum=totalsum+num;
       } 
       int leftsum=0;
       for(int i=0; i<n;i++){
        totalsum=totalsum-nums[i];
        ans[i]=Math.abs(leftsum-totalsum);
        leftsum=leftsum+nums[i];
       }
       return ans;
    }
}
