class Solution {
    
    HashMap<Integer,Integer> map;
    int arr[];
    
    public int traverse(int val){
        if(map.containsKey(val)){
            if(map.get(val)!=0){return map.get(val);}
            int res = 1+traverse(val+1);
            map.put(val,res);
            return res;
        }
        return 0;
    }
    
    public int longestConsecutive(int[] nums) {
        map = new HashMap<>();
        this.arr=nums;
        for(int x:nums){map.put(x,0);}
        int max=0,len=0;
        for(int x:nums){
            if(map.get(x)!=0){max=Math.max(max,map.get(x));continue;}
            traverse(x);
            max=Math.max(max,map.get(x));
        }
        return max;
    }
}
