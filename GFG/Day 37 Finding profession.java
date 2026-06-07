class Solution {
    public String profession(int level, int pos) {
        // code here
        int count=Integer.bitCount(pos-1);
        if(count%2==0){
            return "Engineer";
        }
        return "Doctor";
    }
}
