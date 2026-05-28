class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j =0;
        int sum =0;
        double avg;
        int size = nums.length;
        double mx= -Double.MAX_VALUE;
        while(j<size){
            sum = sum+nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                avg = (double)sum/k;
                 mx=Math.max(mx,avg);
                 sum = sum - nums[i];
                i++;
                j++;

            }
        }
      return mx;
        
    }
}