class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
    int i = 0,j=0,mn=Integer.MAX_VALUE,sum =0;
    int size = nums.length;
    while(j<size){
        sum=sum+nums[j];
    
    while(sum>=target){
        int k = j-i+1;
        mn= Math.min(mn,k);
        sum= sum-nums[i];
        i++;
        
    }
    j++;
      
    }
    return mn == Integer.MAX_VALUE ? 0 : mn;
    
    }
}