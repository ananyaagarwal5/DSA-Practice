class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a=-1,f;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
         for(int i : nums){
             f = map.get(i);
            if(f==1){
                 a = i;
            }
         }
         return a;
    }
}