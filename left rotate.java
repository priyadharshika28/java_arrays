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
        int[] res = leftrotate(arr,k);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static int[] leftrotate(int[] arr,int k){
        int j;
        for(int i=1;i<=k;i++){
            int temp = arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=temp;
        }
        return arr;
    }
}
