import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        if(n<=2){
            System.out.println("array should have atleast 2 elements");
        }  
        else if(n==3){
            sum+=arr[0]+arr[n-1];
        }
        else{
            sum+=arr[0]+arr[1]+arr[n-1]+arr[n-2];
        }
        System.out.println(sum);
    }
}
