class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int c=0;
        int a =0;
        for(int i =0;i <n; i++){
            if(nums[i]==1){
               c++;
               a = Math.max(a,c);
            }
            
            else {
                c = 0;
            }
             
        }
        return a;
    }
}