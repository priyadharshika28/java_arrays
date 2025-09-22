import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = rigthrotate(arr,k);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static int[] rigthrotate(int[] arr,int k){
        int j;
        int n = arr.length;
        for(int i=1;i<=k;i++){
            int temp = arr[n-1];
            for(j=n-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=temp;
        }
        return arr;
    }
}
