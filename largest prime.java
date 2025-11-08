import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largestprime = -1;
        for(int res:arr){
            if(isprime(res)){
                if(res>largestprime){
                    largestprime = res;
                }
            }
        }
        System.out.println(largestprime);
    }
    public static boolean isprime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true; 
    }
}
