class Solution {
    public boolean ans=false;
    public boolean makesquare(int[] matchsticks) {
        long sum= 0;
        int len=matchsticks.length;
        for (int i = 0; i < len; i++) {
            sum+=matchsticks[i];
        }
        if(sum%4!=0)return false;
        int average=(int)(sum/4);
        dfs(0,matchsticks,average,average,average,average);
        return ans;
    }
    public void dfs(int index,int[] matchsticks,int edge1,int edge2,int edge3,int edge4){
        if(ans)return;
        if(index==matchsticks.length){
            if(edge1==0&&edge2==0&&edge3==0&&edge4==0){
                ans=true;
            }
            return;
        }
        int a=matchsticks[index];
        if(a<=edge1){
            dfs(index+1,matchsticks,edge1-a,edge2,edge3,edge4);
        }
        if(a<=edge2){
            dfs(index+1,matchsticks,edge1,edge2-a,edge3,edge4);
        }
        if(a<=edge3){
            dfs(index+1,matchsticks,edge1,edge2,edge3-a,edge4);
        }
        if(a<=edge4){
            dfs(index+1,matchsticks,edge1,edge2,edge3,edge4-a);
        }
    }
}
