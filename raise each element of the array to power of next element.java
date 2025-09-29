import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int next = (i==n-1)?arr[0]:arr[i+1];
            System.out.print((int)Math.pow(arr[i],next)+" ");
        }
    }
}
