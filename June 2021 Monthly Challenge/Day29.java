class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int p1=0,p2=0;
        int count=0,res=0;
        while(p2<n){
            if(nums[p2]==0){
                if(k==0){
                    while(nums[p1++]!=0);
                }
                else{
                    k--;
                }
            }
            p2++;
            res = Math.max(res,p2-p1);
        }
        return res;
    }
}
