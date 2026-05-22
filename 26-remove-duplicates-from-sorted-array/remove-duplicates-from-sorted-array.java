class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;
        
        // i is the pointer for the last unique element found
        int i = 0;
        
        // j scans through the array starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // If we find a value different from the current unique element
            if (nums[j] != nums[i]) {
                i++; // Move unique pointer forward
                nums[i] = nums[j]; // Update the next unique slot with the new value
            }
        }
        
        // The number of unique elements is i + 1 (since i is 0-indexed)
        return i + 1;
    }
}