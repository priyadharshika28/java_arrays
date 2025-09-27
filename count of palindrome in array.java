import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int res:arr){
            if(ispalindrome(res)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean ispalindrome(int num){
        int temp = num;
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return temp==rev;
    }
}
