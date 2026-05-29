class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,sum=0,mx=Integer.MIN_VALUE;
        int size = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        if(size==0){
            return 0;
        }
        while(j< size){
            char c= s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
        
        if(map.size()==(j-i+1)){
            mx = Math.max(mx,j-i+1);
        }
        else if(map.size()<(j-i+1)){
            while(map.size()<(j-i+1)){
            char left = s.charAt(i);
            map.put(left,map.get(left)-1);
            if(map.get(left)==0){
                map.remove(left);
            }
            
                i++;}
        }
            j++;
        }
        return mx;

        }
}