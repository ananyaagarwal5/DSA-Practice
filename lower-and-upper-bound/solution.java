import java.util.Scanner;
public class lbub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
       }
       int tar = sc.nextInt();
       int lb = lowerbound(arr,tar);
       System.out.println(lb);
       int ub = upperbound(arr,tar);
       System.out.println(ub);

}
public static int lowerbound(int[] arr,int tar){
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
public static int upperbound(int[] arr,int tar){
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
