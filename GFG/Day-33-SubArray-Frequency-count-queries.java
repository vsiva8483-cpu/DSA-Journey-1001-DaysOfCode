class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0; i<arr.length;i++){
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int[]q:queries){
            int l=q[0];
            int r=q[1];
            int x=q[2];
            if(!map.containsKey(x)){
                ans.add(0);
                continue;
        }
        ArrayList<Integer> list=map.get(x);
        int left=lowerBound(list,l);
        int right=upperBound(list,r);
        ans.add(right-left);
    }
    return ans;
}
private int lowerBound(ArrayList<Integer> list,int target){
    int low=0 , high=list.size();
    while(low<high){
        int mid=low+(high-low)/2;
        if(list.get(mid)<target)
        low=mid+1;
        else
        high=mid;
    }
    return low;
}
private int upperBound(ArrayList<Integer>list,int target){
    int low=0, high =list.size();
    while(low<high){
        int mid=low+(high-low)/2;
        if(list.get(mid)<=target)
        low=mid+1;
        else
        high=mid;
    }
    return low;
}
}
