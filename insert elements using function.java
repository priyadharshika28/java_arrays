import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int num = sc.nextInt();
        int[] res = insertelements(arr,pos,num);
        for(int nums:res){
            System.out.print(nums+" ");
        }
        
    }
    public static int[] insertelements(int[] arr,int pos,int num){
        int n = arr.length-1;
        for(int i=n;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1] = num;
        return arr;
    }
}
