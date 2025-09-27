import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secondlargest(arr));
    }
    public static int secondlargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                second = largest;
                largest = num;
            }
            else if(num>second && num!=largest){
                second = num;
            }
        }
        return second;
    }
}
