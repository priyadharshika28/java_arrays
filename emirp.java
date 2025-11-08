import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversed = reverse_num(n);
        if(isprime(n) && isprime(reversed)){
            System.out.println("both are prime");
        }
        else{
            System.out.println("both are not prime");
        }
    }
    public static int reverse_num(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
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
