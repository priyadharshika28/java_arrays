import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int peak = firstpeakelements(arr);
        if(peak==-1){
            System.out.println("no peak elements");
        }
        else{
            System.out.println(peak);
        }
    }
    public static int firstpeakelements(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if((i==0||arr[i]>arr[i-1]) && (i==n-1 || arr[i]>arr[i+1])){
                return arr[i];
            }
        }
        return -1;
    }
}
