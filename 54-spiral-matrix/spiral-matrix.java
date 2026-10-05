class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top =0, bottom = n-1;
        int left =0, right =m-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int col=left; col<=right; col++){
                res.add(matrix[top][col]);
            }
            top++;
             for(int row=top; row<=bottom; row++){
                res.add(matrix[row][right]);
             } 
             right--;
             if(top<=bottom){
             for(int col=right; col>=left; col--){
                res.add(matrix[bottom][col]);
             }
             bottom--;
             }
             if(left<=right){
              for(int row=bottom; row>=top; row--){
                res.add(matrix[row][left]);
             } 
             left++;}}

             return res;
        
    }
}