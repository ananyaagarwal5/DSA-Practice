class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lb(nums,target);
        int ub = ub(nums,target);
        if(lb==n || nums[lb]!=target)
            return new int[]{-1, -1};
        
            else
            return new int[]{lb,ub-1};
        }
    
    public int lb(int[] arr,int tar){
         int n = arr.length;
    int low = 0;
    int high = n-1;
    int ans = n;
    while(low<=high){
        int mid = low+(high - low)/2;
        if(arr[mid]>=tar){
             ans = mid;
             high = mid-1;
        }
             else {
             low= mid+1;}
            
    }
 return ans;

    }
    public static int ub(int[] arr,int tar){
    int n = arr.length;
    int low = 0;
    int high = n-1;
    int ans = n;
    while(low<=high){
        int mid = low+(high - low)/2;
        if(arr[mid]>tar){
             ans = mid;
             high = mid-1;
        }
             else {
             low= mid+1;}
            
    }
 return ans;
}
}
