import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int res = occurance(arr,num);
        System.out.println(res);
    }
    public static int occurance(int[] arr,int num){
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
}
