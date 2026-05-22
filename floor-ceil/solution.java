import java.util.Scanner;
public class floor_ceil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
       }
       int tar = sc.nextInt();
       int f = floor(arr,tar);
       System.out.println(f);
       int c = ceil(arr,tar);
       System.out.println(c);

}
public static int floor(int[] arr,int tar){
    int n = arr.length;
    int low = 0;
    int high = n-1;
    int ans = n;
    while(low<=high){
        int mid = low+(high - low)/2;
        if(arr[mid]<=tar){
             ans = arr[mid];
             low = mid+1;
        }
             else {
             high= mid-1;}
            
    }
 return ans;
}
public static int ceil(int[] arr,int tar){
    int n = arr.length;
    int low = 0;
    int high = n-1;
    int ans = n;
    while(low<=high){
        int mid = low+(high - low)/2;
        if(arr[mid]>=tar){
             ans = arr[mid];
             high = mid-1;
        }
             else {
             low= mid+1;}
            
    }
 return ans;
}
}
